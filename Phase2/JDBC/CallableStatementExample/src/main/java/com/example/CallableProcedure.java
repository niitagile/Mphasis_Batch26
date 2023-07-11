package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CallableProcedure")
public class CallableProcedure extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int rollno=Integer.parseInt(request.getParameter("txtRollno"));
		try {
			//Call Connection Method
				Connection con=DBConnection.getConnection();
			//Write sql command
				CallableStatement stmt=con.prepareCall("{call getRecord(?,?,?)}");
			    
			    
			    stmt.setInt(1,rollno);
			    stmt.registerOutParameter(2, Types.VARCHAR);
			    stmt.registerOutParameter(3, Types.FLOAT);
			    stmt.execute();
			     
				
			    PrintWriter out=response.getWriter();
			    out.println("<table border=2>");
				out.println("<tr><th>Rollno</th><th>Name</th><th>Marks</th></tr>");
				out.println("<tr>");
				out.print("<td>"+rollno+"</td>");
				out.print("<td>"+stmt.getString(2)+"</td>");
				out.print("<td>"+stmt.getFloat(3)+"</td>");
				out.println("</tr>");
			
			out.println("</table>");
					
					
				con.close();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

}
/*
delimiter $$
create  procedure getRecord(in p_rollno int,out p_name  varchar(20), out p_marks int)
begin
     select name, marks into p_name,p_marks from student where rollno=p_rollno;
end$$

delimiter ;


call getRecord(2,@p_name, @p_marks);
select @p_name, @p_marks;
*/
