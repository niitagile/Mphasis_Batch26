package com.event;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
		
		//Let us raise a start event
		context.start();
		HelloWorld obj=(HelloWorld) context.getBean("helloworld");
		System.out.println(obj.getMessage());
		//Let us raise a stop event
		context.stop();
		
	}

}
