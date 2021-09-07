package com.rms.util;

import java.util.ArrayList;

import com.rms.dto.ItemDto;
import com.rms.entity.Item;

public class ItemMapper {

	public static Item mapItem(ItemDto itemDto) {
		Item item = new Item();
		item.setName(itemDto.getName());
		item.setType(itemDto.getType());
		item.setCategory(itemDto.getCategory());
		item.setPrice(itemDto.getPrice());
		item.setDescription(itemDto.getDescription());
		item.setItemTime(new ArrayList<>() );
		
		return item;
	}
	
}
