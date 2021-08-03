package com.rms.entity;

public class Menu {

	private Integer Id;
	private String Name;
	private String Type;
	private Integer Price;

	public Menu(Integer id) {
		super();
		Id = id;
	}

	public Menu(Integer id, String name, String type, Integer price) {
		super();
		Id = id;
		Name = name;
		Type = type;
		Price = price;
	}

	public Menu() {
		super();
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

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public Integer getPrice() {
		return Price;
	}

	public void setPrice(Integer price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Menu [Id=" + Id + ", Name=" + Name + ", Type=" + Type + ", Price=" + Price + "]";
	}

}
