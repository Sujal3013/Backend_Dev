<%@ page language='java' contentType='text/html; charset=UTF-8' pageEncoding='UTF-8'%>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>My JSP Page</title>
</head>
<body>
<h1>Welcome to Videos Page</h1>
<%
        response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
    String username="";
    if(session.getAttribute("username")==null){
        response.sendRedirect("login.jsp");
    }else{
        username=session.getAttribute("username").toString();
    }
 %>
<embed src="https://www.youtube.com/embed/B44Omyx1vhU?si=R5X-oZgxTQStgvlx" width="320" height="280">

</body>
</html>