package com.h2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.h2.repository.EmployeeRepository;
import com.h2.model.Address;
import com.h2.model.Employee;

@SpringBootApplication
public class SpringH2Example1Application implements CommandLineRunner {
	@Autowired
	EmployeeRepository emprepo;
	public static void main(String[] args) {
		SpringApplication.run(SpringH2Example1Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception{
		Employee emp1=new Employee();
		emp1.setEmpname("Mahesh Sharma");
		emp1.setEmail("mahesh@gmail.com");
		Address address=new Address();
		address.setCity("Delhi");
		emp1.setAddress(address);
		
		address.setEmployee(emp1);
		emprepo.save(emp1);
	}

}
