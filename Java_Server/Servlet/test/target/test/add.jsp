<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Cookies</title>
</head>
<body>
    <%
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    out.println("Username : "+username);
    out.println("Password : "+ password);
    %>
</body>
</html>
