package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ItemDto {
	
	private String name;
	
	public ItemDto(ItemEntity item) {
		this.name = item.getName();
	}
	
	public ItemEntity toItem() {
		return new ItemEntity(name);
	}
}

