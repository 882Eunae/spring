<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp.jsp</title>
</head>
<body>
<h3>mvc패턴</h3>
	<table border="1">
		<tr>
		<td><%=request.getAttribute("name") %></td>
		<td>${dept}</td>
		</tr>
	</table>
</body>
</html>