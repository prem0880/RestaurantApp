package com.rms.util;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.rms.dto.MenuDto;
import com.rms.exception.DuplicateIDException;
import com.rms.exception.EmptyListException;
import com.rms.exception.IDNotExistException;
import com.rms.exception.InvalidDeletionException;
import com.rms.service.MenuService;
import com.rms.service.MenuServiceImpl;

public class MenuUtil implements MenuService {

	
	static Logger logger = Logger.getLogger(MenuUtil.class);
	
	MenuService menuservice = new MenuServiceImpl();
	
	
	
	Scanner sc=new Scanner(System.in);
	
	public void addFoodItem(MenuDto menudto) throws DuplicateIDException{
		
		
		logger.info("In addFood Util");
			
		menuservice.addFoodItem(menudto);
			
		

		
	}

	public void deleteFoodItem(MenuDto menudto) throws InvalidDeletionException{
		

		logger.info("In deleteFood Util");
		menuservice.deleteFoodItem(menudto);

		
	}

	public void updateFoodItem(MenuDto menudto) throws IDNotExistException{
		
		logger.info("In updateFood Util");
		menuservice.updateFoodItem(menudto);
		
		
	}

	public void displayFoodItem() throws EmptyListException{
	
		logger.info("In displayFood Util");
		menuservice.displayFoodItem();
	}

	
	
	
}
