package com.example.AllInOne.dao;

import java.util.List;

import com.example.AllInOne.model.Employee;

public interface EmployeeDAO {
	public void addEmployee( Employee e);
	public Employee getEmployee(int emp) ;
	public List<Employee> getEmployeeList();
}
