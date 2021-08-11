package com.rms.service;


import org.apache.log4j.Logger;

import com.rms.dao.MenuDao;
import com.rms.dao.MenuDaoImpl;
import com.rms.dto.MenuDto;
import com.rms.exception.IDNotExistException;
import com.rms.exception.InvalidIDException;

public class MenuServiceImpl implements MenuService {

	static Logger logger = Logger.getLogger(MenuServiceImpl.class);

	MenuDao menudao = new MenuDaoImpl();
	
	@Override
	public void addFoodItem(MenuDto menudto) {

		logger.debug("Inside 'AddFoodItem ServiceImp'");

		
		try {
			menudao.addFoodItem(menudto);
		} catch (InvalidIDException e) {
			logger.info(e);
		}

	}

	@Override
	public void deleteFoodItem(MenuDto menudto){

		logger.debug("Inside 'DeleteFoodItem ServiceImpl'");

		menudao.deleteFoodItem(menudto);

	}

	@Override
	public void updateFoodItem(MenuDto menudto) {
		logger.debug("Inside 'UpdateFoodItem ServiceImpl'");
		
		menudao.updateFoodItem(menudto);

	}

	@Override
	public void displayFoodItem(){
		logger.debug("Inside 'DisplayFoodItem ServiceImpl'");

		menudao.displayFoodItem();

	}

}
