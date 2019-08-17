package com.example.AllInOne.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AllInOne.dao.EmployeeDAO;
import com.example.AllInOne.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO empDAO;
	@Override
	public void addEmployee(Employee e) {
		empDAO.addEmployee(e);
	}
	@Override
	public Employee getEmployee(int empid) {
		// TODO Auto-generated method stub
		return empDAO.getEmployee(empid);
	}
	@Override
	public List<Employee> getEmpList() {
		// TODO Auto-generated method stub
		return empDAO.getEmployeeList();
	}

}
