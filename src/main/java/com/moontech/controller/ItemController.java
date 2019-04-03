package com.moontech.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.moontech.entity.Item;
import com.moontech.service.ItemService;

@RestController
@RequestMapping(value = "/api")
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	
	@RequestMapping(value = "/getAllItems", method = RequestMethod.GET)
	public List<Item> getAllItems(){
		return itemService.getAllItems();
		
	}
	@RequestMapping(value = "/saveItem", method = RequestMethod.POST)
	public Item saveItem(@Valid @RequestBody Item item) {
		return itemService.saveItem(item);
	}
	

}
