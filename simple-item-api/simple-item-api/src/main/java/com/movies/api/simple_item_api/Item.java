package com.movies.api.simple_item_api;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
public class Item {
	
	private int id;
	@NotBlank(message="Item name is required")
	private String name;
	private String description;
	

}
