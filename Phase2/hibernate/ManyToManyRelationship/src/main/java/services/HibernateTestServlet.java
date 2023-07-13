package services;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.CustomerEntity;
import beans.SubscriptionEntity;





@WebServlet("/HibernateTestServlet")
public class HibernateTestServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	
	void register(Set<CustomerEntity>custList){
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		for(CustomerEntity obj : custList)
		session.save(obj);
		
		session.getTransaction().commit();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Add CustomerList
		Set<CustomerEntity> custList= new HashSet<>();
		
		CustomerEntity cust1=new CustomerEntity();
		cust1.setCustname("Manisha");
		CustomerEntity cust2=new CustomerEntity();
		cust2.setCustname("Harika");
		custList.add(cust1);
		custList.add(cust2);
		
		//Add Subscriptions
Set<SubscriptionEntity> subList= new HashSet<>();
		
		SubscriptionEntity sub1=new SubscriptionEntity();
		sub1.setSubsname("primevideo");
		SubscriptionEntity sub2=new SubscriptionEntity();
		sub2.setSubsname("hotstar");
		subList.add(sub1);
		subList.add(sub2);
		
		cust1.setSubscriptions(subList);
		cust2.setSubscriptions(subList);
		
		sub1.setCustomers(custList);
		sub2.setCustomers(custList);
		
		register(custList);
	}

}
