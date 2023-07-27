package com.h2.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="empaddress")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	int addreessid;
	
	@Column(length=20)
	String city;
	
	public int getAddreessid() {
		return addreessid;
	}
	public String getCity() {
		return city;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@OneToOne(targetEntity = Employee.class)
	Employee employee;
	
	public void setAddreessid(int addreessid) {
		this.addreessid = addreessid;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
