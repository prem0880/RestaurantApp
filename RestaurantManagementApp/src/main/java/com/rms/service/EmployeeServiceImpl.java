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

public class EmployeeServiceImpl implements EmployeeService {

	static Logger logger = Logger.getLogger(EmployeeServiceImpl.class);

	static List<EmployeeDto> eDTO = new ArrayList<EmployeeDto>();

	@Override
	public void addEmployee(EmployeeDto employeedto) throws DuplicateIDException {

		logger.debug("In add Employee-ServiceImplementation");// logger-debug

		if (eDTO.isEmpty()) {
			eDTO.add(employeedto);
		} else {
			EmployeeDto emp = eDTO.stream().filter(a -> a.getId() == employeedto.getId()).findAny().orElse(null);
			if (emp == null) {
				logger.info("Employee Record inserted");// logger.info
				eDTO.add(employeedto);

			} else {
				throw new DuplicateIDException("Duplicate ID found" + "\n"); // logger-error

			}
		}

	}

	@Override
	public void deleteEmployee(EmployeeDto employeedto) throws InvalidDeletionException {

		logger.debug("In delete Employee-ServiceImplementation");

		EmployeeDto emp = eDTO.stream().filter(a -> a.getId() == employeedto.getId()).findAny().orElse(null);

		if (emp == null) {
			throw new InvalidDeletionException("Deletion is Invalid,No such ID found" + "\n");
		} else {
			logger.info("Employee Record deleted");
			eDTO = eDTO.stream().filter(a -> a.getId() != employeedto.getId()).collect(Collectors.toList());
		}

	}

	@Override
	public void updateEmployee(EmployeeDto employeedto) throws IDNotExistException {

		logger.debug("In update Employee-ServiceImplementation");

		List<EmployeeDto> e = eDTO.stream().filter(a -> a.getId() == employeedto.getId()).collect(Collectors.toList());
		if (e.isEmpty()) {
			throw new IDNotExistException("No Employee Records Available for Updation");
		}
		e.forEach(a -> a.setName(employeedto.getName()));
		e.forEach(a -> a.setSalary(employeedto.getSalary()));
		e.forEach(a -> a.setPhone(employeedto.getPhone()));
		e.forEach(a -> a.setEmail(employeedto.getEmail()));
		e.forEach(a -> a.setAddress(employeedto.getAddress()));

		if (eDTO.containsAll(e) != true) {
			logger.info("Employee Record updated");
			eDTO.addAll(e);

		}
	}

	@Override
	public void displayEmployee() throws EmptyListException {

		logger.debug("In display Employee-ServiceImplementation");

		logger.info("Employee Records are" + "\n");
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
