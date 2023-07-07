package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ViewRecords")
public class ViewRecords extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//Call Connection method
			Connection con=DBConnection.getConnection();
			//Write sql command
			String query="select * from Student";
			//to execute sql command create Statement Object
			Statement stmt=con.createStatement();
			//get Result
			ResultSet rs=stmt.executeQuery(query);
			
			//display result in html page
			PrintWriter out=response.getWriter();
			out.println("<table border=2>");
			out.println("<tr>"
					+ "<th>Rollno</th>"
					+ "<th>Name</th>"
					+ "<th>Marks</th>"
					+ "</tr>");
			while(rs.next()) {
				out.println("<tr>");
				out.print(	"<td>"+rs.getInt("rollno")+"</td>");
				out.print("<td>"+rs.getString("sname")+"</td>");
				out.print("<td>"+rs.getFloat("marks")+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
