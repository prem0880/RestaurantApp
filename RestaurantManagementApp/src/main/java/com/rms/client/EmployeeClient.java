package com.rms.client;

import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.rms.controller.EmployeeController;
import com.rms.dto.EmployeeDto;
import com.rms.exception.DuplicateIDException;
import com.rms.exception.EmptyListException;
import com.rms.exception.IDNotExistException;
import com.rms.exception.InvalidDeletionException;

public class EmployeeClient {

	
	static Logger logger = Logger.getLogger(EmployeeClient.class);

	public static void main(String[] args) throws DuplicateIDException, InvalidDeletionException, IDNotExistException, EmptyListException 
	{
		
		
		BasicConfigurator.configure();  
		
		logger.info("In main");  
		
		EmployeeController econtrol = new EmployeeController();
		
		
		Scanner sc=new Scanner(System.in);
		
		int ch;

		for (;;) {
			System.out.println("======Employee - ADMIN==============");

			System.out.println("1.Add Employee Records" + "\n" + "2.Remove Employee Records" + "\n" + "3.Update Employee Records" + "\n"
					+ "4.Display Employee Records" + "\n" + "5.Exit" + "\n");

			ch = sc.nextInt();

			switch (ch) {

			case 1: {

				System.out.println("\n" + "OPERATION-CREATION/ADDING OF EMPLOYEE RECORDS" + "\n");

				System.out.println("Enter the Employee ID");

				Integer employeeid = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter the Employee Name");

				String employeename = sc.nextLine();

				System.out.println("Enter the Employee Salary");

				Integer employeesalary = sc.nextInt();

				System.out.println("Enter the Employee Phone");

				Integer employeephone = sc.nextInt();
				
				sc.nextLine();

				System.out.println("Enter the Employee Email");

				String employeemail = sc.nextLine();
				
				System.out.println("Enter the Employee Address");

				String employeeaddress = sc.nextLine();
				
				
				EmployeeDto employeedto = new EmployeeDto(employeeid,employeename,employeesalary,employeephone,employeemail,employeeaddress);
				
				
				econtrol.addEmployee(employeedto);
		
				break;
			}
			
			case 2:{
				

				System.out.println("\n" + "OPERATION-DELETION OF EMPLOYEE RECORDS" + "\n");

				System.out.println("Enter the Employee ID to remove");

				Integer employeeid = sc.nextInt();
				sc.nextLine();

				EmployeeDto employeedto = new EmployeeDto(employeeid);
				
				econtrol.deleteEmployee(employeedto);

				break;
			}
			
			case 3:{
				System.out.println("\n" + "OPERATION-UPDATION OF EMPLOYEE RECORDS" + "\n");

				System.out.println("Enter the Employee ID to update");

				Integer employeeid = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter the Employee Name to update");

				String employeename = sc.nextLine();

				System.out.println("Enter the Employee Salary to update");

				Integer employeesalary = sc.nextInt();

				System.out.println("Enter the Employee Phone to update");

				Integer employeephone = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter the Employee Email to update");

				String employeemail = sc.nextLine();
				
				System.out.println("Enter the Employee Address to update");

				String employeeaddress = sc.nextLine();
				
				
				EmployeeDto employeedto = new EmployeeDto(employeeid,employeename,employeesalary,employeephone,employeemail,employeeaddress);
				
				
				econtrol.updateEmployee(employeedto);
		
				break;

				
			}
			
			case 4:{
				
				System.out.println("\n" + "OPERATION-DISPLAYING OF EMPLOYEE RECORDS" + "\n");	
				
				econtrol.displayEmployee();
				
				break;
				
			}
			
			case 5:
			{
				sc.close();
				System.exit(0);
				
			}
			
			
			
	}
		}
}
}

