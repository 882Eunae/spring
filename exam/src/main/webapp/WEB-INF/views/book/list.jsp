<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>



<%@include file="../includes/header.jsp"%>

<div class="container-lg">
<h2>자유게시판</h2>




<div class="card">
	<div class="card-header">
		Board List Page
		<button id='regBtn' type="button"
			class="btn btn-xs pull-right text-decoration-underline">도서등록</button>
	</div>
	<div class="card-body">
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th>도서번호</th>
					<th>도서명</th>
					<th>표지</th>		
					<th>출판일자</th>
					<th>금액</th>
					<th>출판사</th>
					<th>도서소개</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="book">
					<tr>
						<td>${book.bookNo}</td>
						<td>${book.bookName}</td>
						<td><img src="/images/${book.bookCoverimg }" width="100" ></td>
						<td><fmt:formatDate pattern="yyyy-MM-dd"
								value="${book.bookDate}" /></td>
						<td>${book.bookPrice}</td>
						<td>${book.bookPublisher}</td>
						<td>${book.bookInfo}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>	
		<!--  end Pagination -->
	</div>

	
</div>
<!--  end panel-body -->
</div>
<script type="text/javascript">
	$(document).ready( function() {

		var result = '${result}';
		checkModal(result);
		//history.replaceState({}, null, null);

		function checkModal(result) {

			if (result === '') { // || history.state
				return;
			}

			if (parseInt(result) > 0) {
				$(".modal-body").html("게시글 " + parseInt(result) + " 번이 등록되었습니다.");
			}

		    const options = { backdrop: false, focus: false, keyboard: true }
		    const myModal = document.getElementById('myModal')
		    const myModalAlternative = new bootstrap.Modal('#myModal', options)
		    myModalAlternative.show(myModal)
		}

		$("#regBtn").on("click", function() {
			self.location = "/book/register";
		});

		var actionForm = $("#actionForm");

		$(".move").on("click", function(e) {
			e.preventDefault();
			actionForm.append("<input type='hidden' name='bno' value='"
											+ $(this).attr("href")
											+ "'>");
			actionForm.attr("action", "/board/get");
			actionForm.submit();
		});

		var searchForm = $("#searchForm");

		$("#searchForm button").on("click", function(e) {
			if (!searchForm.find("option:selected").val()) {
				alert("검색종류를 선택하세요");
				return false;
			}

			if (!searchForm.find("input[name='keyword']").val()) {
				alert("키워드를 입력하세요");
				return false;
			}

			searchForm.find("input[name='pageNum']").val("1");
			e.preventDefault();
			searchForm.submit();
		});

		$(".pagination a").on("click", function(e) {
			e.preventDefault();
			actionForm.find("input[name='pageNum']").val($(this).attr("href"));
			searchForm.submit();
		});
	});
</script>






<%@include file="../includes/footer.jsp"%>