package com.movies.api.simple_item_api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/items")
public class ItemController {
	
	
	@Autowired
	private ItemService itemService;

	@PostMapping
	public ResponseEntity<Item> addItem(@Valid @RequestBody  Item item){
		
		Item savedItem =itemService.addItem(item);
		
		return ResponseEntity.ok(savedItem);
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Item> getItemById (@PathVariable int id){
		return ResponseEntity.of(Optional.ofNullable(itemService.getItemById(id)));
	}
	
	
	@GetMapping
	public ResponseEntity<List<Item>> getAllItems(){
		
		List<Item> allItems=itemService.getAllItems();
		return ResponseEntity.ok(allItems);
		
	}
}
