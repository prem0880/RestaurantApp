package com.rms.dao;

import java.util.List;

import com.rms.dto.ItemTimeDto;
import com.rms.entity.ItemTime;

public interface ItemTimeDao {

	public Long addFoodItemTime(ItemTimeDto itemTimeDto);
	
	public List<ItemTime> viewFoodItemTime();
	
	
}
