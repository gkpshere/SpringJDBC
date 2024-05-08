/**
 * 
 */
package com.gayathri.jdbc.assignment.controller;

import java.util.List;

import org.slf4j.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gayathri.jdbc.Employee;
import com.gayathri.jdbc.assignment.dao.EmployeeDAO;

/**
 * 
 */
@RestController
public class EmployeeController {
	
	public static Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeDAO EmployeeDAO;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		logger.info("Controller");
		return EmployeeDAO.getAllEmployees();
		
		
	}

}
