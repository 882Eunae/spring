<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%   // page -> requesst -> session -> application 
   request.setAttribute("username", "홍길동");
   session.setAttribute("username", "토토로");
   request.setAttribute("list", Arrays.asList("월요일","화요일","수요일")); 
%>
username:${username }<br>
session username: ${sessionScope.username }<br>
parameter : ${param.age } <%=request.getParameter("age")%><br> 
parameter : ${param.age } <%=request.getParameterValues("age")%><br>
header : ${header.userAgent } <%=request.getHeader("userAgent") %><br>
ip_addr : ${pageContext.request.remoteAddr } <%=request.getlsit %>
 
</body>
</html>