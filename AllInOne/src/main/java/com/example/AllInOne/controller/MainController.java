package com.example.AllInOne.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.AllInOne.model.Employee;
import com.example.AllInOne.service.EmployeeService;

@Controller
public class MainController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("addEmp")
	public String addEmploye(ModelMap map) {
		map.addAttribute("empForm", new Employee());
		return "addEmp";
	}
	
	@RequestMapping("searchEmp")
	public String hello(ModelMap map) {
		map.addAttribute("empForm", new Employee());
		return "searchEmp";
	}
	@RequestMapping(value = "/empAdd", method = RequestMethod.POST)
	public String saveOrUpdateUser(@ModelAttribute("empForm") Employee emp) {
		System.out.println(emp.getFirstName());
		System.out.println(emp.getLastName());
		System.out.println(emp.getId());
		service.addEmployee(emp);
		return "ok";
	}
	@RequestMapping(value="/empSearch", method=RequestMethod.POST)
	public ModelAndView Search(@ModelAttribute("empForm") Employee emp) {
		System.out.println(emp.getId());
		Employee employee=service.getEmployee(emp.getId());
		ModelAndView view= new ModelAndView("empSearchRes");
		view.addObject("employee", employee);
		return view;
	}
	@RequestMapping("/")
	public String hello1() {
		return "welcome";
	}
	@RequestMapping("/all")
	public String allData(ModelMap map) {
		map.addAttribute("msg",new Date());
		List<Employee> empList=new ArrayList<Employee>();
		empList=service.getEmpList();
		map.addAttribute("empList", empList);
		return "all";
	}
	
}
