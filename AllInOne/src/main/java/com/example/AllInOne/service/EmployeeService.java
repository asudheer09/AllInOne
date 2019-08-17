package com.example.AllInOne.service;

import java.util.List;

import com.example.AllInOne.model.Employee;

public interface EmployeeService {
	public void addEmployee(Employee e);
	public Employee getEmployee(int empid);
	public List<Employee>getEmpList();
}
