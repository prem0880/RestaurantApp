package com.rms.service;

import java.util.List;

import com.rms.dao.ItemDaoImpl;
import com.rms.dto.ItemDto;
import com.rms.entity.Item;

public class ItemServiceImpl implements ItemService{

	
	ItemDaoImpl itemDaoImpl = new ItemDaoImpl();
	
	public Long addFoodItem(ItemDto itemDto) {
		
		return itemDaoImpl.addFoodItem(itemDto);
		
		
		
	}

	
	@Override
	public List<Item> viewFoodItem() {
		return itemDaoImpl.viewFoodItem();
	}

	@Override
	public List<Item> viewFoodItemById(Long id) {
		return itemDaoImpl.viewFoodItemById(id);
	}
	

	@Override
	public Boolean updateFoodItemById(ItemDto itemDto,Long id) {
		return itemDaoImpl.updateFoodItemById(itemDto,id);
	}

	
	 @Override
	public Boolean deleteFoodItemById(Long id) {
		return itemDaoImpl.deleteFoodItemById(id);
	}
	
}
