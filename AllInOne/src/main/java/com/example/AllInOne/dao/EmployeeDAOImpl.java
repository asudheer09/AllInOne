package com.example.AllInOne.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.AllInOne.model.Employee;

@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void addEmployee(Employee e) {
		String sql= "INSERT INTO `sudheer`.`employee` (`id`, `firstName`, `lastName`) VALUES ('"+e.getId()+"', '"+e.getFirstName()+"', '"+e.getLastName()+"'); ";
		jdbcTemplate.update(sql);
	}

	@Override
	public Employee getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

}
