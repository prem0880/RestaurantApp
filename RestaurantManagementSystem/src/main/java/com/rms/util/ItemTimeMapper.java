package com.rms.util;

import com.rms.dto.ItemTimeDto;
import com.rms.entity.ItemTime;

public class ItemTimeMapper {

	
	public static ItemTime mapItemTime(ItemTimeDto itemTimeDto) {
		ItemTime item = new ItemTime();
		item.setTimeOfDay(itemTimeDto.getTimeOfDay());
		//item.setItem(itemTimeDto.getItem());
		
		return item;
	}
	
}
