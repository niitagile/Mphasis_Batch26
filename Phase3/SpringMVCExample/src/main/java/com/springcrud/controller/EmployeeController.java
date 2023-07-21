package com.springcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springcrud.beans.Employee;
import com.springcrud.dao.EmployeeDao;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDao dao;
	//show form to take new record
	@RequestMapping(value="/empform",method=RequestMethod.GET)
	public String showForm(Model m) {
		m.addAttribute("emp", new Employee());
		return "empform";//name of jsp form
		
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(@ModelAttribute("emp")Employee emp) {
		dao.insert(emp);
		return "redirect:/viewemp";
		
	}
	@RequestMapping(value="/viewemp" ,method=RequestMethod.GET)
	public String viewmap(Model m) {
		List<Employee> empList=dao.getEmployeeDetails();
		for(Employee emp : empList) {
			System.out.println(emp.getName());
		}
		m.addAttribute(empList);
		return "viewemp";
	}
	
	@RequestMapping(value="editeemp/{eid}")
	public String edit(@PathVariable int eid,Model m) {
		Employee emp=dao.getEmpId(eid);
		m.addAttribute(emp);
		return "empeditform";
	}
	
	@RequestMapping(value="editsave", method=RequestMethod.POST)
	public String editSave(@ModelAttribute("emp") Employee emp) {
		dao.update(emp);
		return "redirect:/viewemp";
	}
	
	@RequestMapping(value="deleteemp/{eid}")
	public String delete(@PathVariable int eid) {
		dao.delete(eid);
		return "redirect:/viewemp";
	}
}
