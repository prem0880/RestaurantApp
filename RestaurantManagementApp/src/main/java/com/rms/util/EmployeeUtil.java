package com.rms.util;

import org.apache.log4j.Logger;

import com.rms.dto.EmployeeDto;
import com.rms.exception.DuplicateIDException;
import com.rms.exception.EmptyListException;
import com.rms.exception.IDNotExistException;
import com.rms.exception.InvalidDeletionException;
import com.rms.service.EmployeeService;
import com.rms.service.EmployeeServiceImpl;

public class EmployeeUtil implements EmployeeService {
	static Logger logger = Logger.getLogger(EmployeeUtil.class);

		
	
	
	EmployeeService employeeservice= new EmployeeServiceImpl();
	
	
public void addEmployee(EmployeeDto employeedto) throws DuplicateIDException{
		logger.info("In addEmployee-Util");  

		
		employeeservice.addEmployee(employeedto);
		
	}
	
	
	
	public void deleteEmployee(EmployeeDto employeedto) throws InvalidDeletionException 
	{
		logger.info("In deleteEmployee-Util");  

		employeeservice.deleteEmployee(employeedto);
		
	}
	
	
	public void updateEmployee(EmployeeDto employeedto) throws IDNotExistException
	{
		logger.info("In updateEmployee-Util");  

		employeeservice.updateEmployee(employeedto);
	}
	
	
	public void displayEmployee() throws EmptyListException
	{
		logger.info("In displayEmployee-Util");  

		employeeservice.displayEmployee();
	}
	
}
