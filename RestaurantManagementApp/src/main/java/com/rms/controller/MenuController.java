package com.rms.controller;

import org.apache.log4j.Logger;

import com.rms.dto.MenuDto;

import com.rms.exception.IDNotExistException;
import com.rms.exception.InvalidIDException;
import com.rms.util.MenuUtil;

public class MenuController {

	static Logger logger = Logger.getLogger(MenuController.class);

	MenuUtil menuutil = new MenuUtil();

	public void addFoodItem(MenuDto menudto) {

		logger.info("In addFood Controller");

		try {
			menuutil.addFoodItem(menudto);
		} catch (InvalidIDException e) {

			logger.info(e);
		}

	}

	public void deleteFoodItem(MenuDto menudto) {
		logger.info("In deleteFood Controller");

		try {
			menuutil.deleteFoodItem(menudto);
		} catch (Exception e) {
			logger.info(e);
		}

	}

	public void updateFoodItem(MenuDto menudto) {
		logger.info("In updateFood Controller");

		try {
			menuutil.updateFoodItem(menudto);
		} catch (IDNotExistException e) {
			logger.info(e);
		}

	}

	public void displayFoodItem() {
		logger.info("In displayFood Controller");

		try {
			menuutil.displayFoodItem();
		} catch (Exception e) {
			logger.info(e);
		}

	}

}
