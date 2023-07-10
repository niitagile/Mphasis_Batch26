package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteRecord")
public class DeleteRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//Read all values from HTML Page
			int rollno=Integer.parseInt(request.getParameter("txtRollno"));
		
			
			//Call Connection Method
			Connection con=DBConnection.getConnection();
			//Create query
			String query="delete from Student where rollno=?";
			//Create Statement Object
			PreparedStatement psmt=con.prepareStatement(query);
			psmt.setInt(1, rollno);
			
					
			//execute query
			int ans=psmt.executeUpdate();
			PrintWriter out=response.getWriter();
			if(ans>0)
				out.println("Record Deleted");
			else
				out.println("Record not Deleted");
			
		}catch(Exception e) {
			e.printStackTrace();}
		}
	}


