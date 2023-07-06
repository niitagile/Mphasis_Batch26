package com.credential;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginChecker") //annotation to add mapping with url
public class LoginChecker extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public LoginChecker() {
		super();

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String uname=request.getParameter("txtuname");
		String pword=request.getParameter("txtpword");
		PrintWriter out=response.getWriter();
		if(uname.equalsIgnoreCase("Java")&& pword.equals("eclipse@123"))
			out.println("Welcome user::"+uname);
		else
			out.println("Invalid User");

	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String uname=request.getParameter("txtuname");
		String pword=request.getParameter("txtpword");
		PrintWriter out=response.getWriter();
		RequestDispatcher dispatch;
		if(uname.equalsIgnoreCase("Java")&& pword.equals("eclipse@123")) {
			//Session is created by container and it give id to each session
			HttpSession session=request.getSession(true); //true means create new session object if it is not in conatiner
			out.println("Session id="+session.getId());
			session.setAttribute("username", uname);
			
			
			dispatch=request.getRequestDispatcher("Welcome");
			dispatch.forward(request,response);// to move to next page Welcome
		
			
		}
		else
			out.println("Invalid User");
		dispatch=request.getRequestDispatcher("index.html");
		dispatch.include(request,response);
	}
}
