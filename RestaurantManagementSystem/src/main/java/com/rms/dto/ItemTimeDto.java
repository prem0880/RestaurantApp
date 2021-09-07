package com.rms.dto;

import java.util.List;

import com.rms.entity.Item;

public class ItemTimeDto {
	
	private Long id;
	private String timeOfDay;
	private List<Item> item;
	
	public ItemTimeDto() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public List<Item> getItem() {
		return item;
	}
	public void setItem(List<Item> item) {
		this.item = item;
	}
	public String getTimeOfDay() {
		return timeOfDay;
	}
	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}
	@Override
	public String toString() {
		return "ItemTimeDto [id=" + id + ", timeOfDay=" + timeOfDay + "]";
	}
	
    
    
	
}
