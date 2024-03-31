package com.jstlexample;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DemoService")
public class service extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String name="Sujal";
        req.setAttribute("label", name);
        RequestDispatcher rd=req.getRequestDispatcher("demoservice.jsp");
        rd.forward(req, resp);
    }
    
}
