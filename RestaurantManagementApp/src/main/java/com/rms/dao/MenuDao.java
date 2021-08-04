package com.rms.dao;

import com.rms.dto.MenuDto;
import com.rms.exception.InvalidIDException;

public interface MenuDao {

	public void addFoodItem(MenuDto menudto) throws InvalidIDException;
	public void deleteFoodItem(MenuDto menudto);
	public void updateFoodItem(MenuDto menudto);
	public void displayFoodItem();
	
}
