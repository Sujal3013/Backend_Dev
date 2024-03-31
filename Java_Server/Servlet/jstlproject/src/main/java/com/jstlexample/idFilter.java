package com.jstlexample;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

@WebFilter("/addAlien")
public class idFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
                PrintWriter out=response.getWriter();
                HttpServletRequest req=(HttpServletRequest)request;
                int aid=Integer.parseInt(req.getParameter("aid")); 

                if(aid>1){
                    chain.doFilter(request, response);
                }else{
                    out.println("Invalid Input : Id");
                }
                

    }

    @Override
    public void destroy() {

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

}
