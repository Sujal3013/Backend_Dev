<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Page</title>
</head>
<body>
    <h1>Error</h1>
    <p>An error occurred:</p>
    <%= exception.getMessage()%>
    
</body>
</html>