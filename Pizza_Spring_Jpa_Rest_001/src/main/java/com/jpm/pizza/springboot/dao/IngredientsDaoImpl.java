package com.jpm.pizza.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import org.springframework.stereotype.Repository;

import com.jpm.pizza.springboot.entities.Ingredients;




@Repository
public class IngredientsDaoImpl implements IngredientsDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Ingredients> getIngreientsList() {
		Query qry =entityManager.createQuery("from Ingredients");
		List<Ingredients> IngredientsList = qry.getResultList();
		
		return IngredientsList;
	}

	@Override
	public Long addPizzaIngrident(Ingredients ingredients) {
		entityManager.persist(ingredients);
		return ingredients.getIngredeientId();
		
	}

	@Override
	public boolean updatePizzaItem(Ingredients ingredients) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteIngridentById(Long ingredeientId) {
		Ingredients ingridients = this.getIngridentById(ingredeientId);
		
		if(ingridients==null)
			return false;
		else{
			entityManager.remove(ingridients); //Now it is detached object
			return true;
		}
	}

	@Override
	public Ingredients getIngridentById(Long ingredeientId) {
		Ingredients ingridients = entityManager.find(Ingredients.class ,ingredeientId);
		return ingridients;
	}
	
	

}
