package com.example.demo.model;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItemSevice {
	
	@Autowired
	private ItemReposity reposity;

	public void save(ItemDto item) {
		reposity.save(item.toItem());
	}

	public List<ItemDto> findAll() {
		List<ItemEntity> itens = reposity.findAll();
		List<ItemDto> itensDto = 
				itens.stream()
				.map(ItemDto::new)
				.collect(Collectors.toList());
		return itensDto;
	}
}
