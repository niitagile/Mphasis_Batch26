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


@WebServlet("/UpdateRecord")
public class UpdateRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//Read all values from HTML Page
			int rollno=Integer.parseInt(request.getParameter("txtRollno"));
			String name=request.getParameter("txtName");
			Float marks=Float.parseFloat(request.getParameter("txtMarks"));
			
			//Call Connection Method
			Connection con=DBConnection.getConnection();
			//Create query
			String query="Update Student set  sname=? ,marks=? where rollno=?";
			//Create Statement Object
			PreparedStatement psmt=con.prepareStatement(query);
		
			psmt.setString(1, name);
			psmt.setFloat(2, marks);
			psmt.setInt(3, rollno);
					
			//execute query
			int ans=psmt.executeUpdate();
			PrintWriter out=response.getWriter();
			if(ans>0)
				out.println("Record Updated");
			else
				out.println("Record not Updated");
			
		}catch(Exception e) {
			e.printStackTrace();}
		}

	}


