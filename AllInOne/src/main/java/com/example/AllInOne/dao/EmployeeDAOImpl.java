package com.example.AllInOne.dao;

import java.util.List;

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
	public Employee getEmployee(int empId) {
		String sql="select * from sudheer.employee where id="+empId;
		return jdbcTemplate.queryForObject(sql, new EmployeeRowMapper());
	}


	@Override
	public List<Employee> getEmployeeList() {
		String sql="select * from sudheer.employee";
		return jdbcTemplate.query(sql, new EmployeeRowMapper());
	}

}
