package com.example.AllInOne.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.AllInOne.model.Employee;
import com.example.AllInOne.service.EmployeeService;


@Controller
public class MainController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("hello")
	public String hello(ModelMap map) {
		map.addAttribute("empForm", new Employee());
		return "hello";
	}
	@RequestMapping(value = "/empSubmit", method = RequestMethod.POST)
	public String saveOrUpdateUser(@ModelAttribute("empForm") Employee emp) {
		System.out.println(emp.getFirstName());
		System.out.println(emp.getLastName());
		System.out.println(emp.getId());
		service.addEmployee(emp);
		return "ok";
	}

	@RequestMapping("welcome")
	public String hello1() {
		return "welcome";
	}
	
}
