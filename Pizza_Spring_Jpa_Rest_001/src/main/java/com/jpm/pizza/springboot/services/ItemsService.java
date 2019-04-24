package com.jpm.pizza.springboot.services;

import java.util.List;



import com.jpm.pizza.springboot.entities.Items;


public interface ItemsService {
	
	
	
	public Long addPizzaItems(Items items);
	public List<Items> getPizzaItemList();
	public boolean updatePizzaItem(Items items);
	public boolean deletePizzaItem(Long itemId);
	public Items serachPizzaItem(Long itemId);
}
