package com.rms.service;

import com.rms.dto.MenuDto;
import com.rms.exception.IDNotExistException;
import com.rms.exception.InvalidIDException;


public interface MenuService {

	public void addFoodItem(MenuDto menudto) throws InvalidIDException;

	public void deleteFoodItem(MenuDto menudto) ;

	public void updateFoodItem(MenuDto menudto) throws IDNotExistException;

	public void displayFoodItem() ;

}
