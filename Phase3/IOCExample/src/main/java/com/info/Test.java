package com.info;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//IOC- Inverse of Controller which is responsible for bean life cycle
		//To types of Container- BeanFactory, ApplicationContext
		
		//FirstWay BeanContext
		Resource resource=new ClassPathResource("application.xml");
		@SuppressWarnings("deprecation")
		BeanFactory factory=new XmlBeanFactory(resource);
		Student student=(Student)factory.getBean("student");
		System.out.println("name="+student.getName());
		
		//Second Way- ApplicationContext
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
		Student student1=(Student)factory.getBean("student");
		System.out.println("name="+student1.getName());
	}

}
