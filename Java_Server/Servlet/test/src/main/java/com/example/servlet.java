package com.example;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class servlet extends HttpServlet  {
    public void processRequest(HttpServletRequest req,HttpServletResponse res) throws IOException{
        res.setContentType("text/html;charset=UTF-8");
        try {
            
            String username=req.getParameter("username");
            String password=req.getParameter("password");
           
            
            // req.setAttribute("result",result);


            // Calling Request Dispatcher for calling another servlet
            // RequestDispatcher rd=req.getRequestDispatcher("sq");
            // try {
            //     rd.forward(req, res);
            // } catch (Exception e) {
            //     e.printStackTrace();
            // }

            // USING SEND REDIRECT
            //res.sendRedirect("sq?result="+result); // URL redirecting

            // Using Session Management 
            // HttpSession session=req.getSession();
            // session.setAttribute("result", result);

            Cookie cookie1=new Cookie("username", username+"");
            Cookie cookie2=new Cookie("password", password+"");
            res.addCookie(cookie1);
            res.addCookie(cookie2);
            res.sendRedirect("loginstatus");

            // Using Cookies
        }
        catch(Exception e){
            System.err.println(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
}
