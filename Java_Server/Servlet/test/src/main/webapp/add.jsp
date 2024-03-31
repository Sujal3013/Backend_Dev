<!-- JSP Tags -->
<!-- 1. Declaration -->
<!-- 2. Directive -->
<!-- 3. Scriplet -->
<!-- 4. Expression -->

<!-- Directive tag below -->
<%@page import="java.util.*"%>

<!-- JSP DIRECTIVE -->

<!-- @Page -->
<!-- @ page attribute="value" attribute="value" -->
<!-- language,session,extends,import,etc -->

<!-- @Include -->
<!-- @include file="filename" -->

<!-- @Taglib -->
<!-- @taglib uri="uri" prefix="fx" -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Cookies</title>
</head>
<body>
    <!-- Declaration tag below -->
    <%!
        int coeff=4;
    %>
    <!-- Scriplet tag below -->
    <%
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    out.println("Username : "+username);
    out.println("Password : "+ password);
    %>

    My Username is : <%= coeff %>
</body>
</html>

<!-- Implicit Objects -->
<!-- 
request
response
pageContext
out
session
application
config 
-->

<!-- EXCEPTION HANDLING -->

