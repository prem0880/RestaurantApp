package com.rms.dao;

import com.rms.dto.MenuDto;

public interface MenuDao {

	public void addFoodItem(MenuDto menudto);
	public void deleteFoodItem(MenuDto menudto);
	public void updateFoodItem(MenuDto menudto);
	public void displayFoodItem();
	
}
