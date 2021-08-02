package com.rms.controller;

import org.apache.log4j.Logger;

import com.rms.dto.EmployeeDto;
import com.rms.exception.DuplicateIDException;
import com.rms.exception.EmptyListException;
import com.rms.exception.IDNotExistException;
import com.rms.exception.InvalidDeletionException;
import com.rms.util.EmployeeUtil;

public class EmployeeController {
	static Logger logger = Logger.getLogger(EmployeeController.class);

		
	
	EmployeeUtil employeeutil = new EmployeeUtil();
	
	public void addEmployee(EmployeeDto employeedto){
	
		logger.info("In addEmployee-controller");  
		
		
		try {
			employeeutil.addEmployee(employeedto);
		} catch (DuplicateIDException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public void deleteEmployee(EmployeeDto employeedto) 
	{
		logger.info("In deleteEmployee-controller"); 
		try {
			employeeutil.deleteEmployee(employeedto);
		} catch (InvalidDeletionException e) {

			e.printStackTrace();
		}
	
	}
	
	
	public void updateEmployee(EmployeeDto employeedto)
	{
		logger.info("In updateEmployee-controller"); 
		try {
			employeeutil.updateEmployee(employeedto);
		} catch (IDNotExistException e) {
			e.printStackTrace();
		}

	}
	
	
	public void displayEmployee()
	{
		logger.info("In displayEmployee-controller"); 
		try {
			employeeutil.displayEmployee();
		} catch (EmptyListException e) {
			e.printStackTrace();
		}

	}
}
