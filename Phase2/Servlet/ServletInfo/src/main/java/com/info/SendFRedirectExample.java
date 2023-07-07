package com.info;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/SendFRedirectExample")
public class SendFRedirectExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.sendRedirect("http://www.google.com");
		
		ServletConfig config=getServletConfig();//getServletConfig() is method of Servlet interface
		String authname=config.getInitParameter("authorname");
		PrintWriter out=response.getWriter();
		out.println(authname);
		
		//Servlet Context 
		ServletContext context=getServletContext();
		String db=context.getInitParameter("databasename");
		out.println("database name="+db);
		
	}

}
