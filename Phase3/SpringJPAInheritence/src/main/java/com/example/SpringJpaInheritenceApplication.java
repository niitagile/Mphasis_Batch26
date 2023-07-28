package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringJpaInheritenceApplication implements CommandLineRunner {
	@Autowired
	EmployeeRepository emprepo;
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaInheritenceApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception{
		Employee e1=new Employee();
		e1.setEmpname("Kartik");
		
		Reg_Employee reg_emp=new Reg_Employee();
		reg_emp.setEmpname("Anuj");
		reg_emp.setSalary(50000);
		reg_emp.setBonus(2000);
		
		Contract_Employee cont_emp=new Contract_Employee();
		cont_emp.setEmpname("Ashish");
		cont_emp.setPay_per_hr(2000);
		cont_emp.setContract_duration(20);
		emprepo.save(e1);
		emprepo.save(reg_emp);
		emprepo.save(cont_emp);
	}
}
