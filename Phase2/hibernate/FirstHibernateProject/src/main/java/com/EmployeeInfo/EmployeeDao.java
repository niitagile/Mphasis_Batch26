package com.EmployeeInfo;

import java.io.IOException;
import java.io.PrintWriter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeDao")
public class EmployeeDao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Read values from html form 
		//int empid=Integer.parseInt(request.getParameter("txtempno"));
		String empname = request.getParameter("txtempname");
			float salary = Float.parseFloat(request.getParameter("txtsalary"));
			
			//put all values in Employee Object
			Employee emp=new Employee();
			//emp.setEmpid(empid);
			emp.setEmpname(empname);
			emp.setSalary(salary);
			
			//activate Connection with database
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			// Require to start session
			Session session = sessionFactory.openSession();
			//Transaction start
			session.beginTransaction();
			//insert a record-->
			int i = (Integer) session.save(emp);
			//save changes in database permanently
			session.getTransaction().commit();
			//check for save
			PrintWriter out = response.getWriter();
			if (i > 0)
				out.println("Record inserted");
			else
				out.println("Record not inserted");

			
	}

}
