package com.example.AllInOne.service;

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

}
