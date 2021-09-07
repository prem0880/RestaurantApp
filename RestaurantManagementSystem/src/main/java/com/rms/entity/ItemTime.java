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
@Table(name="ItemTime")
public class ItemTime {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private Long id;
	
	@Column(name="TimeOfDay")
	private String timeOfDay;
	
	@ManyToMany(mappedBy="itemTime",fetch = FetchType.EAGER)
	private List<Item> item;
	
	

	public ItemTime() {
		super();
	}

	public Long getId() {
		return id;
	}
	
	


	public void setId(Long id) {
		this.id = id;
	}

	public String getTimeOfDay() {
		return timeOfDay;
	}

	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}

	
	
	
	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ItemTime [id=" + id + ", timeOfDay=" + timeOfDay + "]";
	}

	
	
}
