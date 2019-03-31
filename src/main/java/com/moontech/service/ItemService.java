package com.moontech.service;

import java.util.List;

import com.moontech.entity.Item;

public interface ItemService {
	
	Item getItemById(long id);
	List<Item> getAllItems();
	Item saveItem(Item item);

}
