package com.rms.dto;

public class EmployeeDto {
	private Integer Id;
	private String Name;
	private Integer Salary;
	private Integer Phone;
	private String Email;
	private String Address;

	public EmployeeDto() {
		super();
	}

	public EmployeeDto(Integer id) {
		super();
		Id = id;
	}

	public EmployeeDto(Integer id, String name, Integer salary, Integer phone, String email, String address) {
		super();
		Id = id;
		Name = name;
		Salary = salary;
		Phone = phone;
		Email = email;
		Address = address;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getSalary() {
		return Salary;
	}

	public void setSalary(Integer salary) {
		Salary = salary;
	}

	public Integer getPhone() {
		return Phone;
	}

	public void setPhone(Integer phone) {
		Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "EmployeeDto [Id=" + Id + ", Name=" + Name + ", Salary=" + Salary + ", Phone=" + Phone + ", Email="
				+ Email + ", Address=" + Address + "]";
	}

}
