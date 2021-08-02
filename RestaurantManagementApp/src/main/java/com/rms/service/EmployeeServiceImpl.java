package com.rms.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

import com.rms.dto.EmployeeDto;

import com.rms.exception.DuplicateIDException;
import com.rms.exception.EmptyListException;
import com.rms.exception.IDNotExistException;
import com.rms.exception.InvalidDeletionException;

public class EmployeeServiceImpl implements EmployeeService{

	static Logger logger = Logger.getLogger(EmployeeServiceImpl.class);

	
	static List<EmployeeDto> eDTO = new ArrayList<EmployeeDto>();

	
	@Override
	public void addEmployee(EmployeeDto employeedto) throws DuplicateIDException {
		
		logger.info("In add Employee-ServiceImplementation");
		if (eDTO.isEmpty()) {
			eDTO.add(employeedto);
		}
		else 
		{
		EmployeeDto emp = eDTO.stream().filter(a -> a.getEmployeeId() == employeedto.getEmployeeId()).findAny()
				.orElse(null);
		if (emp == null) {
			System.out.println("Employee Record inserted!");
			eDTO.add(employeedto);

		} else {
			throw new DuplicateIDException("Duplicate ID found" + "\n");

		}
		}
		
	}
	
	@Override
	public void deleteEmployee(EmployeeDto employeedto) throws InvalidDeletionException {
		
		
		logger.info("In delete Employee-ServiceImplementation");
		
		EmployeeDto emp = eDTO.stream().filter(a -> a.getEmployeeId() == employeedto.getEmployeeId()).findAny()
				.orElse(null);
		
		if (emp == null) {
			throw new InvalidDeletionException("Deletion is Invalid,No such ID found" + "\n");
		} else {
			System.out.println("Employee Record deleted!");
			eDTO = eDTO.stream().filter(a -> a.getEmployeeId() != employeedto.getEmployeeId())
					.collect(Collectors.toList());
		}
		
	}
	@Override
	public void updateEmployee(EmployeeDto employeedto) throws IDNotExistException {
		
		logger.info("In update Employee-ServiceImplementation");
		
		List<EmployeeDto> e = eDTO.stream().filter(a -> a.getEmployeeId() == employeedto.getEmployeeId())
				.collect(Collectors.toList());
		if (e.isEmpty()) {
			throw new IDNotExistException("No Employee Records Available for Updation");
		}
		e.forEach(a -> a.setEmployeeName(employeedto.getEmployeeName()));
		e.forEach(a -> a.setEmployeeSalary(employeedto.getEmployeeSalary()));
		e.forEach(a -> a.setEmployeePhone(employeedto.getEmployeePhone()));
		e.forEach(a -> a.setEmployeeEmail(employeedto.getEmployeeEmail()));
		e.forEach(a -> a.setEmployeeAddress(employeedto.getEmployeeAddress()));
		
		if (eDTO.containsAll(e) != true) {
			System.out.println("Employee Record updated!");
			eDTO.addAll(e);
		
		
		
		
	}
	}
	
	@Override
	public void displayEmployee() throws EmptyListException {
		
		logger.info("In display Employee-ServiceImplementation");
		
		System.out.println("Employee Records are" + "\n");
		if (eDTO.isEmpty() != true) {
			for (Object x : eDTO) {
				System.out.println(x);
				System.out.println();
			}
		} else {
			throw new EmptyListException("No Employee Records Found!!");

		}

	}
	
	
}
