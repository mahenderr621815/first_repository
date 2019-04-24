package com.jpm.pizza.springboot.dao;

import java.util.List;

import com.jpm.pizza.springboot.entities.Ingredients;


public interface IngredientsDao {

	public List<Ingredients> getIngreientsList();
	public Long addPizzaIngrident(Ingredients ingredients);
	public boolean updatePizzaItem(Ingredients ingredients);
	public boolean deleteIngridentById(Long ingredeientId);
	public Ingredients getIngridentById(Long ingredeientId);
}