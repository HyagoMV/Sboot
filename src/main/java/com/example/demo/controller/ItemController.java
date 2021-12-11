package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ItemDto;
import com.example.demo.model.ItemSevice;

@RestController
@RequestMapping("welcome")
public class ItemController {

	@Autowired
	private ItemSevice sevice;

	@PostMapping
	public void save(@RequestBody ItemDto item) {
		sevice.save(item);
	}

	@GetMapping
	public List<ItemDto> fildAll() {
		return sevice.findAll();
	}
}
