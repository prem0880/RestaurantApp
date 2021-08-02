package com.rms.dto;

public class EmployeeDto {
	private Integer EmployeeId;
	private String EmployeeName;
	private Integer EmployeeSalary;
	private Integer EmployeePhone;
	private String EmployeeEmail;
	private String EmployeeAddress;
	public EmployeeDto(Integer employeeId, String employeeName, Integer employeeSalary, Integer employeePhone,
			String employeeEmail, String employeeAddress) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmployeeSalary = employeeSalary;
		EmployeePhone = employeePhone;
		EmployeeEmail = employeeEmail;
		EmployeeAddress = employeeAddress;
	}
	public EmployeeDto(Integer employeeId) {
		super();
		EmployeeId = employeeId;
	}
	public Integer getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public Integer getEmployeeSalary() {
		return EmployeeSalary;
	}
	public void setEmployeeSalary(Integer employeeSalary) {
		EmployeeSalary = employeeSalary;
	}
	public Integer getEmployeePhone() {
		return EmployeePhone;
	}
	public void setEmployeePhone(Integer employeePhone) {
		EmployeePhone = employeePhone;
	}
	public String getEmployeeEmail() {
		return EmployeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		EmployeeEmail = employeeEmail;
	}
	public String getEmployeeAddress() {
		return EmployeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		EmployeeAddress = employeeAddress;
	}
	@Override
	public String toString() {
		return "EmployeeDto [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeeSalary="
				+ EmployeeSalary + ", EmployeePhone=" + EmployeePhone + ", EmployeeEmail=" + EmployeeEmail
				+ ", EmployeeAddress=" + EmployeeAddress + "]";
	}
	
	
}
