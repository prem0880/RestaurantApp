package com.rms.entity;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="Item")
public class Item {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private Long id;
	
	@Column(name="Name",nullable=false,length=20)
	private String name;
	

	@Column(name="Type",nullable=false)
	private String type;
	
	@Column(name="Category",nullable=false)
	private String category;
	
	@Column(name="Price",nullable=false)
	private Integer price;
	
	@Column(name="Description",nullable=false)
	private String description;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<ItemTime> itemTime;
	
	
	public Item()
	{
		
	}
	

	public List<ItemTime> getItemTime() {
		return itemTime;
	}



	public void setItemTime(List<ItemTime> itemTime) {
		this.itemTime = itemTime;
	}



	public Long getId() {
		return id;
	}

	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", description="
				+ description + "]";
	}
	
	
	
	
}
