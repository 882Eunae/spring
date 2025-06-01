<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@include file="../includes/header.jsp"%>


<div class="row">
  <div class="col-lg-12">
    <h1 class="page-header">Board Read</h1>
  </div>
  <!-- /.col-lg-12 -->
</div>
<!-- /.row -->

<div class="row">
  <div class="col-lg-12">
    <div class="panel panel-default">

      <div class="panel-heading">Board Read Page</div>
      <!-- /.panel-heading -->
      <div class="panel-body">

          <div class="form-group">
          <label>Bno</label> <input class="form-control" name='bno'
            value='<c:out value="${board.bno }"/>' readonly="readonly">
        </div>

        <div class="form-group">
          <label>Title</label> <input class="form-control" name='title'
            value='<c:out value="${board.title }"/>' readonly="readonly">
        </div>

        <div class="form-group">
          <label>Text area</label>
          <textarea class="form-control" rows="3" name='content'
            readonly="readonly"><c:out value="${board.content}" /></textarea>
        </div>

        <div class="form-group">
          <label>Writer</label> <input class="form-control" name='writer'
            value='<c:out value="${board.writer }"/>' readonly="readonly">
        </div>

<%-- 		<button data-oper='modify' class="btn btn-default">
        <a href="/board/modify?bno=<c:out value="${board.bno}"/>">Modify</a></button>
        <button data-oper='list' class="btn btn-info">
        <a href="/board/list">List</a></button> --%>


<button data-oper='modify' class="btn btn-default">Modify</button>
<button data-oper='list' class="btn btn-info">List</button>

<%-- <form id='operForm' action="/boad/modify" method="get">
  <input type='hidden' id='bno' name='bno' value='<c:out value="${board.bno}"/>'>
</form> --%>


<form id='operForm' action="/boad/modify" method="get">
  <input type='hidden' id='bno' name='bno' value='<c:out value="${board.bno}"/>'>
  <input type='hidden' name='pageNum' value='<c:out value="${cri.pageNum}"/>'>
  <input type='hidden' name='amount' value='<c:out value="${cri.amount}"/>'>
  <input type='hidden' name='keyword' value='<c:out value="${cri.keyword}"/>'>
  <input type='hidden' name='type' value='<c:out value="${cri.type}"/>'>  
</form>



      </div>
      <!--  end panel-body -->

    </div>
    <!--  end panel-body -->
  </div>
  <!-- end panel -->
  
  <div>
      <!-- 댓글 입력 폼 -->
    <div class="mb-3">
      <textarea class="form-control mb-2" id="txtReply" rows="3" placeholder="댓글을 입력하세요..."></textarea>
      <button class="btn btn-primary" id="btnReplyAdd" >댓글 작성</button>
    </div>

    <hr>

    <!-- 댓글 리스트 -->
    <div id="commentlist">
	  
  </div>
</div>
<!-- /.row -->


<script>
	document.querySelector("#btnReplyAdd")
	  .addEventListener("click", ()=>{
		const reply = document.querySelector("#txtReply").value;
		const data = { reply , replyer:"홍길동"  }
		register(data)
	})
</script>

<script type="text/javascript">
$(document).ready(function() {
	  getReplyList(1); 
  var operForm = $("#operForm"); 

  $("button[data-oper='modify']").on("click", function(e){
    
    operForm.attr("action","/board/modify").submit();
    
  });
  
    
  $("button[data-oper='list']").on("click", function(e){
    
    operForm.find("#bno").remove();
    operForm.attr("action","/board/list")
    operForm.submit();
    
  });  
  //댓글 찾아오는거 까지 가능 
  function getReplyList(page) {
	  $.ajax({
	    url: "/board/" + bno.value + "/replies?page=" + page,
	    type: "get",
	    dataType: "json",
	    success: function(data) {
	    	console.log(data.list);
	      drawReplyList(data.list);
	    

	    }
	  });
	}
  
  function drawReplyList(list) {
	  const commentList = document.querySelector("#commentlist");
	  commentList.innerHTML = ""; // 비우기

	  if (list.length === 0) {
	    commentList.innerHTML = "<p>댓글이 없습니다.</p>";
	    return;
	  }

	  list.forEach(function(reply) {
		  console.log(reply.replyDate);                 
		  console.log(new Date(reply.replyDate));        
		  console.log(formatTime(reply.replyDate));  
		const formatDate=formatTime(reply.replyDate);
		console.log('formatDate',formatDate);
	    const div = document.createElement("div");
	    div.classList.add("comment", "mb-4");

	    div.innerHTML = `
	      <div class="d-flex justify-content-between">
	        <strong>${reply.replyer}</strong>   
	      </div>
	      <div class="reply-replyer"></div>
	      <div class="reply-content"></div>
	      <div>
	      <div class="reply-date"></div>
	        <button class="btn btn-sm btn-outline-secondary">수정</button>
	        <button class="btn btn-sm btn-outline-danger">삭제</button>
	      </div>
	    `;
		div.querySelector(".reply-date").innerText = formatDate; 
	    div.querySelector(".reply-content").innerText = reply.reply; 
	    div.querySelector(".reply-replyer").innerText = reply.replyer; 

	    commentList.appendChild(div);
	  });
	}
  
  function formatTime(timestamp) {
	  if (!timestamp) {
	    return "";
	  }
	  const date = new Date(parseInt(timestamp)); // 숫자 보장
	  if (isNaN(date.getTime())) {
	    console.log("Invalid timestamp:", timestamp);
	    return "--";
	  }
	  const yyyy = date.getFullYear();
	  console.log(yyyy);
	  const mm = ('0' + (date.getMonth() + 1)).slice(-2);
	  console.log(mm);
	  const dd = ('0' + date.getDate()).slice(-2);
	  return yyyy+'-'+mm+'-'+dd;
	}

  

  
});
</script>


<%@include file="../includes/footer.jsp"%>