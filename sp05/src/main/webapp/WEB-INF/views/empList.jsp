<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empList.jsp</title>
</head>
<body>
		<h3>스프링 컨트롤러 연습 </h3>
		<!--  http://localhost:8081/sp05/-->
			<!-- 상대경로 -->
		<image src="../image/cat.jpg"></image>
		<!--  절대경로 -->
		<img src="<c:url value="/image/cat.jpg"/>"/>
		<!-- <image src="./resources/cat.jpg"></image> -->
		${servertime}
</body>
</html>