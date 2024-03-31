<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp" %>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
</head>
<body>
    <h1>Hello Home...</h1>
    <%
    // try{
    //     int k=9/0;
    // }
    // catch(Exception e){
    //     out.println("Error"+e.getMessage());
    // }
    // int k=9/0;
    String url="jdbc:mysql://localhost:3306/testdb"; //path to database
    String username="root";
    String password="Sujal@64";
    Class.forName("com.mysql.jdbc.Driver"); //Registering the registered
    int id=5;
    String name="Dev";
    String sql1="select * from testTable",sql2="insert into testTable values (4,'Shreeti')";
    String sql3="insert into testTable values (" + id + ",'" + name + "')";
    Connection con=DriverManager.getConnection(url,username,password); //establishing connection
    Statement st=con.createStatement();
    int count=st.executeUpdate(sql3);
    ResultSet rs=st.executeQuery(sql1); //generating results
    rs.next();

    %>
    Id : <%= rs.getString(1)%><br/>
    Name : <%= rs.getString(2)%>
    Row Count : <%= count%>
    
</body>
</html>


<!-- Java Database connectivity -->

<!-- 1. import  --- java.sql.* -->
<!-- 2. load and register the driver -->
<!-- 3. create connection -->
<!-- 4. create a statement -->
<!-- 5. execute the query  -->
<!-- 6. process the results -->
<!-- 7. close -->
