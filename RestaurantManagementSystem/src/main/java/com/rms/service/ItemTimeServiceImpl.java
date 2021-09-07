package com.rms.service;

import java.util.List;

import com.rms.dao.ItemTimeDaoImpl;
import com.rms.dto.ItemTimeDto;
import com.rms.entity.ItemTime;

public class ItemTimeServiceImpl implements ItemTimeService {

	
	ItemTimeDaoImpl itemTimeDaoImpl  = new ItemTimeDaoImpl();
	
	
	@Override
	public Long addFoodItemTime(ItemTimeDto itemTimeDto) {
		return itemTimeDaoImpl.addFoodItemTime(itemTimeDto);
	}
	
	public List<ItemTime> viewFoodItemTime(){
		return itemTimeDaoImpl.viewFoodItemTime();
	}
}
