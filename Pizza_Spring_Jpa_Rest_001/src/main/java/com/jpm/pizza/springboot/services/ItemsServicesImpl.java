package com.jpm.pizza.springboot.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpm.pizza.springboot.dao.ItemsDao;
import com.jpm.pizza.springboot.entities.Items;


@Service
public class ItemsServicesImpl implements ItemsService {

	@Autowired
	private ItemsDao itemsDao;
	
	@Override
	@Transactional
	public Long addPizzaItems(Items items) {
		// TODO Auto-generated method stub
		
		return itemsDao.addPizzaItem(items);
	}

	@Override
	public List<Items> getPizzaItemList() {
		// TODO Auto-generated method stub
		System.out.println("**********ItemsService*********");
		return itemsDao.getItemList();
	}

	@Override
	@Transactional
	public boolean updatePizzaItem(Items items) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	@Transactional
	public boolean deletePizzaItem(Long itemId) {
		// TODO Auto-generated method stub
		return itemsDao.deletePizzaById(itemId);
	}

	@Override
	public Items serachPizzaItem(Long itemId) {
		Items items = itemsDao.getPizzaById(itemId);
		return items;
	}

}
