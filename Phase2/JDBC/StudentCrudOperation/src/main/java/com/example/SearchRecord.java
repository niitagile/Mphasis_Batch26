package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SearchRecord")
public class SearchRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//Read all values from HTML Page
			int rollno=Integer.parseInt(request.getParameter("txtRollno"));
			
			
			//Call Connection Method
			Connection con=DBConnection.getConnection();
			//Create query
			String query="select * from student where rollno=?";
			//Create Statement Object
			PreparedStatement psmt=con.prepareStatement(query);
			psmt.setInt(1, rollno);
		
					
			//execute query
			ResultSet rs=psmt.executeQuery();
			
			
			//display result in html page
			PrintWriter out=response.getWriter();
			out.println("<table border=2>");
			out.println("<tr>"
					+ "<th>Rollno</th>"
					+ "<th>Name</th>"
					+ "<th>Marks</th>"
					+ "</tr>");
			if(rs.next()) {
				out.println("<tr>");
				out.print(	"<td>"+rs.getInt("rollno")+"</td>");
				out.print("<td>"+rs.getString("sname")+"</td>");
				out.print("<td>"+rs.getFloat("marks")+"</td>");
				out.println("</tr>");
			
			out.println("</table>");
			}
			else
				out.println("Record not found");
			RequestDispatcher rsd=request.getRequestDispatcher("Search.html");
			rsd.include(request, response);
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();}
		}
	}


