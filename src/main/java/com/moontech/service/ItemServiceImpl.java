package com.moontech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moontech.entity.Item;
import com.moontech.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService{
	
	@Autowired
	ItemRepository repo;
	
	@Override
	public Item getItemById(long id) {
		return repo.getOne(id);
	}
	@Override
	public List<Item> getAllItems(){
		return repo.findAll();
	}
	@Override
	public Item saveItem(Item item){
		return repo.save(item);
	}
}
