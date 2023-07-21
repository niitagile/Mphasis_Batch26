package com.springcrud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springcrud.beans.Employee;


public class EmployeeDao {

	JdbcTemplate template;
	
	
	

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int insert(Employee emp) {
		String sql="insert into Employee(eid, name, designation,salary) values(?,?,?,?)";
		int ans=template.update(sql,emp.getEid(),emp.getName(),emp.getDesignation(),emp.getSalary());
		return ans;
	}
	
	public int update(Employee emp) {
		String sql="update Employee set  name=?, designation=?,salary=? where eid=?";
		int ans=template.update(sql,emp.getName(),emp.getDesignation(),emp.getSalary(),emp.getEid());
		return ans;
	}
	
	public int delete(int id) {
		String sql="delete from Employee where eid=?";
		int ans=template.update(sql,id);
		return ans;
	}
	
	public Employee getEmpId(int id){
		String sql="select * from Employee where eid=?";
		Employee emp=template.queryForObject(sql, new Object[] {id},new EmployeeMapper() );
		
		
		return emp;
	}
	
	public List<Employee> getEmployeeDetails(){
		String sql="select * from Employee";
		List<Employee> empList=template.query(sql, new EmployeeMapper());
		return empList;
	}

}
