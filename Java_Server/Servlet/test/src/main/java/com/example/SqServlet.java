package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginstatus")
public class SqServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        // int result=(int)req.getAttribute("result");
        // result*=result;
        // out.println("Result is : "+result);

        // int result=Integer.parseInt(req.getParameter("result"));
        // HttpSession session = req.getSession();

        // int result = (int) session.getAttribute("result");
        String username="",password="";
        Cookie cookies[]=req.getCookies();
        for(Cookie c:cookies){
            if(c.getName().equals("username")){
                username=c.getValue();
            }
            if(c.getName().equals("password")){
                password=c.getValue();
            }
        }
        out.println(username);
        out.println(password);
        // ServletContext ctx=getServletContext();
        // String initUsername=ctx.getInitParameter("username");
        // String initPassword=ctx.getInitParameter("password");
        // if(initUsername.equals(username)){
        //     out.println("Username : "+username+" is correct.");
        //     if(initPassword.equals(password)){
        //         out.println("Password is correct");
        //         out.println("Congratulations !! You are logged in to servlet.");
        //     }else{
        //         out.println("Oops !! Wrong Password");
        //         out.println("Invalid User");
        //     }
        // }else{
        //     out.println("Oops !! Username : "+username+" is incorrect.");
        // }
        
    }

}
