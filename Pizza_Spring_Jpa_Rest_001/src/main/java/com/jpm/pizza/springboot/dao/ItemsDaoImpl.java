package com.jpm.pizza.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jpm.pizza.springboot.entities.Items;




@Repository
public class ItemsDaoImpl implements ItemsDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Items> getItemList() {
		System.out.println("*************ItemsDaoImpl*******");	
		Query qry =entityManager.createQuery("from Items");
		List<Items> ItemsList = qry.getResultList();
		
		return ItemsList;
	}

	@Override
	public Long addPizzaItem(Items items) {
		entityManager.persist(items);
		return items.getItemId();
	}

	@Override
	public boolean updatePizzaItem(Items items) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePizzaById(Long itemId) {
		Items items = this.getPizzaById(itemId);
		
		if(items==null)
			return false;
		else{
			entityManager.remove(items); //Now it is detached object
			return true;
		}
	}

	@Override
	public Items getPizzaById(Long itemId) {
		Items items = entityManager.find(Items.class ,itemId);
		return items;
	}

}
