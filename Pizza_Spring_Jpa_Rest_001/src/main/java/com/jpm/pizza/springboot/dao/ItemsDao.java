package com.jpm.pizza.springboot.dao;

import java.util.List;

import com.jpm.pizza.springboot.entities.Items;



public interface ItemsDao {

	
	public List<Items> getItemList();
	public Long addPizzaItem(Items items);
	public boolean updatePizzaItem(Items items);
	public boolean deletePizzaById(Long itemId);
	public Items getPizzaById(Long itemId);
	

	
}
