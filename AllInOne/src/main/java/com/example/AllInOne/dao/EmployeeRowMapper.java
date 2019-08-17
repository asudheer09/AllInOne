package com.example.AllInOne.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.AllInOne.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e= new Employee();
		e.setFirstName(rs.getString("firstName"));
		e.setId(new Integer(rs.getString("id")));
		e.setLastName(rs.getString("lastName"));
		return e;
	}

	

	

}
