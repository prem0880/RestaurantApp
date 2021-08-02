package com.rms.service;

import com.rms.dto.MenuDto;
import com.rms.exception.DuplicateIDException;
import com.rms.exception.EmptyListException;
import com.rms.exception.IDNotExistException;
import com.rms.exception.InvalidDeletionException;

public interface MenuService {

	public void addFoodItem(MenuDto menudto) throws DuplicateIDException;
	
	public void deleteFoodItem(MenuDto menudto) throws InvalidDeletionException;
	
	public void updateFoodItem(MenuDto menudto) throws IDNotExistException;
	
	public void displayFoodItem() throws EmptyListException;
	
	
}
