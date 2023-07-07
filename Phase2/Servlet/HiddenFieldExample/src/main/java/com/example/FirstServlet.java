package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	String uname=request.getParameter("txtname");
	out.println("<form action='SecondServlet'>");
	out.println("<input type='hidden' name='uname' value='"+uname+"'>");
	out.println("<input type='text' name='age'>");
	out.println("<input type='Submit'>");
	out.println("<form>");

}
}
