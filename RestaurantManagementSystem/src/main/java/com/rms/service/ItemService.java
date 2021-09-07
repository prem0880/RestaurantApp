package com.rms.service;

import java.util.List;

import com.rms.dto.ItemDto;
import com.rms.entity.Item;

public interface ItemService {

	public Long addFoodItem(ItemDto itemDto);
	
	public List<Item> viewFoodItem();
	
	public List<Item> viewFoodItemById(Long id);
	
	public Boolean updateFoodItemById(ItemDto itemDto,Long id);
	
	public Boolean deleteFoodItemById(Long id);

}
