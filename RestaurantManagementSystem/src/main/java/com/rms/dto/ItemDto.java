package com.rms.dto;

import java.util.ArrayList;
import java.util.List;


public class ItemDto {

	
	private Long id;
	
	private String name;
	
	private String type;
	
	private String category;
	
	private Integer price;
	
	private String description;

	
	private List<ItemTimeDto> itemTime = new ArrayList<ItemTimeDto>();
	
	public ItemDto()
	{
		
	}
	
	

	public List<ItemTimeDto> getItemTime() {
		return itemTime;
	}



	public void setItemTime(List<ItemTimeDto> itemTime) {
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
