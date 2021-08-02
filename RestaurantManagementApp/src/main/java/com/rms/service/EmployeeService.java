package com.rms.service;

import com.rms.dto.EmployeeDto;
import com.rms.exception.DuplicateIDException;
import com.rms.exception.EmptyListException;
import com.rms.exception.IDNotExistException;
import com.rms.exception.InvalidDeletionException;

public interface EmployeeService{
	
	public void addEmployee(EmployeeDto employeedto) throws DuplicateIDException;
	
	public void deleteEmployee(EmployeeDto employeedto)throws InvalidDeletionException;
	
	public void updateEmployee(EmployeeDto employeedto)throws IDNotExistException;
	
	public void displayEmployee()throws EmptyListException;
	
}