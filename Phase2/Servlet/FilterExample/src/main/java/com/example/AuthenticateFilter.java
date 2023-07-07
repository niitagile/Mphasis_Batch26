package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpSession;

@WebFilter("/DataInfo")
public class AuthenticateFilter extends HttpFilter implements Filter {
       
    
   
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		String uname=request.getParameter("txtuname");
		String pword=request.getParameter("txtpword");
		PrintWriter out=response.getWriter();
		RequestDispatcher dispatch;
		if(uname.equalsIgnoreCase("Java")&& pword.equals("eclipse@123")) {
				chain.doFilter(request, response);
				}
		else {
			out.println("Invalid Username or password");
		dispatch=request.getRequestDispatcher("index.html");
		dispatch.include(request,response);
	}

	
		
	}
}
	
