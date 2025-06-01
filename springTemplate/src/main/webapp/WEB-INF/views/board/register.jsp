<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/includes/header.jsp" %>	
<div class="row">
</div>
<form role="form" action="register" method="post">
	<label>Title</label> <input class="form-control" name='title'>
	<label>content</label> <input class="form-control" name='content'>
	<label>writer</label> <input class="form-control" name='writer'>
	<button type="submit" class="btn btn-default">submit</button>
</form>
<%@include file="/WEB-INF/views/includes/footer.jsp"%>
