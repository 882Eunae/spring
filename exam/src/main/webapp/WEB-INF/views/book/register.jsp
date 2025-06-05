<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/includes/header.jsp" %>	
<div class="row">
</div>
<form role="form" action="register" method="post">
<!-- 	<label>도서번호</label> <input type="number" class="form-control" name='bookNo'> -->
	<label>도서명</label> <input class="form-control" name='bookName'>
	<label>도서표지</label> <input class="form-control" name='bookCoverimg'>
	<label>출판일자</label> <input type="date" class="form-control" name='bookDate'>
	<label>금액</label> <input type="number" class="form-control" name='bookPrice'>
	<label>출판사</label> <input class="form-control" name='bookPublisher'> 
	<label>도서소개</label> <input class="form-control" name='bookInfo'>  	 
	<button type="submit" class="btn btn-default">submit</button>
</form>
<%@include file="/WEB-INF/views/includes/footer.jsp"%>
