package com.movies.api.simple_item_api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ItemService {
	
	private List<Item> items =new ArrayList<Item>();
	
	private int idCounter=1;
	
	public Item addItem(Item item) {
		
       item.setId(idCounter++);
       
       items.add(item);
	     return item;
	}
	
	public Item  getItemById(int id) {
		for(Item item: items) {
			if(item.getId()==id) {
				return item;
			}
		}
		return null;
	}
	
	
	public List<Item> getAllItems(){
		return items;
	}
	
	
	

}
