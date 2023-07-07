package com.info;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigExample
 */
@WebServlet(
		urlPatterns = { "/ConfigExample" }, 
		initParams = { 
				@WebInitParam(name = "authorname", value = "Anil Mishra")
		})
public class ConfigExample extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig config=getServletConfig();//getServletConfig() is method of Servlet interface
		String authname=config.getInitParameter("authorname");
		PrintWriter out=response.getWriter();
		out.println(authname);
		out.println("Welcome user "+request.getParameter("user"));
		
	}

}
