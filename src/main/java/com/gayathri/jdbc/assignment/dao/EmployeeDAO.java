/**
 * 
 */
package com.gayathri.jdbc.assignment.dao;

import java.util.List;

import com.gayathri.jdbc.Employee;

/**
 * 
 */
public interface EmployeeDAO {
//	Create
	
	int save (Employee Employee);
	
//	Read
	
	List<Employee> getAllEmployees();
	
	Employee getEmployee(int id);
	
//	Update
	
	int update(Employee Employee, int id);
	
//	Delete
	
	int delete (int id);

}
