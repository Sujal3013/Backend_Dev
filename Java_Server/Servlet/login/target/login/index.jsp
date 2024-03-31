<%@ page language='java' contentType='text/html; charset=UTF-8' pageEncoding='UTF-8'%>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>My JSP Page</title>
</head>
<body>
<h1>Welcome to My Home Page</h1>
 <%
    response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
    String username="";
    if(session.getAttribute("username")==null){
        response.sendRedirect("login.jsp");
    }else{
        username=session.getAttribute("username").toString();
    }
 %>
 Welcome , <%=username%><br>
 <a href="videos.jsp">Videos section</a>
<form action="logout">
<input type="submit" value="logout">
</form>
</body>
</html>
