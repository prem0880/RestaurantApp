package com.rms.entity;

public class Employee {

	private Integer Id;// id
	private String Name;// name
	private Integer Salary;
	private Integer Phone;
	private String Email;
	private String Address;

	public Employee() {
		super();
	}

	public Employee(Integer id) {
		super();
		Id = id;
	}

	public Employee(Integer id, String name, Integer salary, Integer phone, String email, String address) {
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
		return "Employee [Id=" + Id + ", Name=" + Name + ", Salary=" + Salary + ", Phone=" + Phone + ", Email=" + Email
				+ ", Address=" + Address + "]";
	}

}
