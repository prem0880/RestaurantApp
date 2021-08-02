package com.rms.dto;

public class MenuDto {
	private Integer foodId;
	private String foodName;
	private String foodType;
	private Integer foodPrice;
	public MenuDto() {
		super();
	}
	
	public MenuDto(Integer foodId) {
		super();
		this.foodId = foodId;
	}

	public MenuDto(Integer foodId, String foodName, String foodType, Integer foodPrice) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodType = foodType;
		this.foodPrice = foodPrice;
	}
	public Integer getFoodId() {
		return foodId;
	}
	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public Integer getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(Integer foodPrice) {
		this.foodPrice = foodPrice;
	}
	@Override
	public String toString() {
		return "MenuDto [foodId=" + foodId + ", foodName=" + foodName + ", foodType=" + foodType + ", foodPrice="
				+ foodPrice + "]";
	}

}
