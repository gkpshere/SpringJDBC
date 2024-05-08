/**
 * 
 */
package com.gayathri.jdbc.assignment.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gayathri.jdbc.Employee;

/**
 * 
 */

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	JdbcTemplate jdbctemplate;

	@Override
	public int save(Employee Employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
	return	jdbctemplate.query("SELECT * FROM tbl_employees", new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Employee Employee, int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
