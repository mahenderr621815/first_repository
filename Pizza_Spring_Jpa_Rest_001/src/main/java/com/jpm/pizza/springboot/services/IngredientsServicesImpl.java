package com.jpm.pizza.springboot.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpm.pizza.springboot.dao.IngredientsDao;
import com.jpm.pizza.springboot.entities.Ingredients;


@Service
public class IngredientsServicesImpl implements IngredientsService {

	@Autowired
	private IngredientsDao ingredientsDao;

	@Override
	@Transactional
	public Long addPizzaIngridients(Ingredients ingridients) {
		// TODO Auto-generated method stub
		return ingredientsDao.addPizzaIngrident(ingridients);
		
	}

	@Override
	public List<Ingredients> getIngridentsList() {
		// TODO Auto-generated method stub
		return ingredientsDao.getIngreientsList();
	}

	@Override
	@Transactional
	public boolean updatePizzaIngridients(Ingredients ingridients) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	@Transactional
	public boolean deletePizzaIngridients(Long ingredeientId) {
		// TODO Auto-generated method stub
		return ingredientsDao.deleteIngridentById(ingredeientId);
	}
	
	
	
	@Override
	public Ingredients serachPizzaIngridients(Long ingredeientId) {
		// TODO Auto-generated method stub
		Ingredients ingridients = ingredientsDao.getIngridentById(ingredeientId);
		return ingridients;
	}
	

}
