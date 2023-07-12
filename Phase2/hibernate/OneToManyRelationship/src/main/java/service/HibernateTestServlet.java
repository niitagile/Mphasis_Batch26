package service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import beans.Answer;
import beans.Question;



@WebServlet("/HibernateTestServlet")
public class HibernateTestServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	
	void register(Question question1){
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(question1);
		
		session.getTransaction().commit();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Answer> ansList= new ArrayList<Answer>();
		
		Question question1=new Question();
		 question1.setQues("What is Hibernate?");
		 question1.setAnswers(ansList);
		
		 
		 
		 Answer ans1=new Answer();
		 ans1.setAnswers("Hibernate is a framework");
		 ans1.setPostedBy("Anita");
		 ansList.add(ans1);
		 
		 Answer ans2=new Answer();
		 ans2.setAnswers("Hibernate is based on ORM");
		 ans2.setPostedBy("Sunil");
		 ansList.add(ans2); 
	    
		register(question1);
	}

}
