package com.jpm.pizza.springboot.services;

import java.util.List;

import com.jpm.pizza.springboot.entities.Ingredients;


public interface IngredientsService {

	public Long addPizzaIngridients(Ingredients ingridients);
	public List<Ingredients> getIngridentsList();
	public boolean updatePizzaIngridients(Ingredients ingridients);
	public boolean deletePizzaIngridients(Long ingredeientId);
	public Ingredients serachPizzaIngridients(Long ingredeientId);
}
