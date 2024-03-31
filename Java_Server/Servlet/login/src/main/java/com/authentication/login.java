package com.authentication;

import java.io.IOException;

import com.authentication.dao.LoginDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname=req.getParameter("uname");
        String upwd=req.getParameter("upwd");
        LoginDao loginObj=new LoginDao();

        if(loginObj.checkCredentials(uname, upwd)){
            HttpSession session=req.getSession();
            session.setAttribute("username", uname);
            resp.sendRedirect("index.jsp");
        }else{
            resp.sendRedirect("login.jsp");
        }
    }
    
}
