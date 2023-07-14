package com.example.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.entity.Teacher;

public class ReadTeacher {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
				                     .configure("hibernate.cfg.xml")
				                     .addAnnotatedClass(Teacher.class)
				                     .buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			
			//start a transaction
			session.beginTransaction();
					
			Teacher tempTeacher = session.get(Teacher.class, 2);
			
			System.out.println(tempTeacher.getF_Name());
			
			session.getTransaction().commit();
			
			System.out.println("Done ");
		}
		finally {
			factory.close();
		}
	}
}
