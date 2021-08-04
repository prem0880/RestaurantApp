package com.rms.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

import com.rms.dao.MenuDao;
import com.rms.dao.MenuDaoImpl;
import com.rms.dto.MenuDto;
import com.rms.exception.DuplicateIDException;
import com.rms.exception.EmptyListException;
import com.rms.exception.IDNotExistException;
import com.rms.exception.InvalidDeletionException;

public class MenuServiceImpl implements MenuService {

	static Logger logger = Logger.getLogger(MenuServiceImpl.class);

	MenuDao menudao = new MenuDaoImpl();
	
	@Override
	public void addFoodItem(MenuDto menudto) throws DuplicateIDException {

		logger.debug("Inside 'AddFoodItem ServiceImp'");

		
		menudao.addFoodItem(menudto);

	}

	@Override
	public void deleteFoodItem(MenuDto menudto) throws InvalidDeletionException {

		logger.debug("Inside 'DeleteFoodItem ServiceImpl'");

		menudao.deleteFoodItem(menudto);

	}

	@Override
	public void updateFoodItem(MenuDto menudto) throws IDNotExistException {
		logger.debug("Inside 'UpdateFoodItem ServiceImpl'");
		
		menudao.updateFoodItem(menudto);

	}

	@Override
	public void displayFoodItem() throws EmptyListException {
		logger.debug("Inside 'DisplayFoodItem ServiceImpl'");

		menudao.displayFoodItem();

	}

}
