package com.springcrud.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springcrud.beans.Employee;

//RowMapper is pre defined interface to convert resultset records to object
public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		employee.setEid(rs.getInt("eid"));
		employee.setName(rs.getString("name"));
		employee.setDesignation(rs.getString("designation"));
		employee.setSalary(rs.getFloat("salary"));
		
		
		return employee;
	}

}
