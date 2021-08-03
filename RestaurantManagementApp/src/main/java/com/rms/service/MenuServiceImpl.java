package com.rms.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

import com.rms.dto.MenuDto;
import com.rms.exception.DuplicateIDException;
import com.rms.exception.EmptyListException;
import com.rms.exception.IDNotExistException;
import com.rms.exception.InvalidDeletionException;

public class MenuServiceImpl implements MenuService {

	static Logger logger = Logger.getLogger(MenuServiceImpl.class);

	static List<MenuDto> menuDTO = new ArrayList<MenuDto>();

	@Override
	public void addFoodItem(MenuDto menudto) throws DuplicateIDException {

		logger.debug("Inside 'AddFoodItem ServiceImp'");

		if (menuDTO.isEmpty()) {
			menuDTO.add(menudto);
		} else {
			MenuDto menu = menuDTO.stream().filter(a -> a.getId() == menudto.getId()).findAny().orElse(null);
			if (menu == null) {
				menuDTO.add(menudto);

			} else {
				throw new DuplicateIDException("Duplicate ID found" + "\n");

			}
		}
	}

	@Override
	public void deleteFoodItem(MenuDto menudto) throws InvalidDeletionException {

		logger.debug("Inside 'DeleteFoodItem ServiceImpl'");

		MenuDto menu = menuDTO.stream().filter(a -> a.getId() == menudto.getId()).findAny().orElse(null);

		if (menu == null) {
			throw new InvalidDeletionException("Deletion is Invalid,No such ID found" + "\n");
		} else {
			menuDTO = menuDTO.stream().filter(a -> a.getId() != menudto.getId()).collect(Collectors.toList());
		}

	}

	@Override
	public void updateFoodItem(MenuDto menudto) throws IDNotExistException {
		logger.debug("Inside 'UpdateFoodItem ServiceImpl'");
		List<MenuDto> t = menuDTO.stream().filter(a -> a.getId() == menudto.getId()).collect(Collectors.toList());
		if (t.isEmpty()) {
			throw new IDNotExistException("No Food Item Available for Updation");
		}
		t.forEach(a -> a.setName(menudto.getName()));
		t.forEach(a -> a.setType(menudto.getType()));
		t.forEach(a -> a.setPrice(menudto.getPrice()));
		if (menuDTO.containsAll(t) != true) {
			menuDTO.addAll(t);
		}

	}

	@Override
	public void displayFoodItem() throws EmptyListException {
		logger.debug("Inside 'DisplayFoodItem ServiceImpl'");

		logger.info("Food Items are" + "\n");
		if (menuDTO.isEmpty() != true) {
			for (Object x : menuDTO) {
				System.out.println(x);
				System.out.println();
			}
		} else {
			throw new EmptyListException("No Food Items Found!!");

		}
	}

}
