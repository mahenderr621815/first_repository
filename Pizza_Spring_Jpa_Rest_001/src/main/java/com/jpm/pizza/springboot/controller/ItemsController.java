package com.jpm.pizza.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpm.pizza.springboot.entities.Ingredients;
import com.jpm.pizza.springboot.entities.Items;
import com.jpm.pizza.springboot.services.IngredientsService;
import com.jpm.pizza.springboot.services.ItemsService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("api/pizza")
public class ItemsController {

	@Autowired
	private ItemsService itemsService;

	@Autowired
	private IngredientsService ingredientService;

	// *********Items*****************
	// http://localhost:8084/api/pizza/items/list
	@GetMapping(value = "/items/list", produces = "application/json")
	
	public List<Items> getAllItems() {
		System.out.println("**************Controller***********");
		return itemsService.getPizzaItemList();
	}

	// http://localhost:8084/api/pizza/pizzaitems/add //new data
	@PostMapping("/pizzaitems/add")
	public HttpStatus saveItems(@RequestBody Items items) {
		return itemsService.addPizzaItems(items) != null ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	// http://localhost:8084/api/pizza/finditems/30 //itemid
	@GetMapping("/finditems/{itemId}")
	public ResponseEntity<Items> serachPizzaItem(@PathVariable(value = "itemId") Long itemId)

	{
		System.out.println("EmployeeController - > find : " + itemId);
		Items items = itemsService.serachPizzaItem(itemId);
		return ResponseEntity.ok().body(items);

	}

	// http://localhost:8084/api/pizza/removeitems/11
	@DeleteMapping("/removeitems/{itemId}")
	public Map<String, Boolean> deletePizzaItem(@PathVariable(value = "itemId") Long itemId) {
		Items items = itemsService.serachPizzaItem(itemId);
		Map<String, Boolean> response = new HashMap<>();
		if (items != null) {
			itemsService.deletePizzaItem(itemId);
			response.put("deleted", Boolean.TRUE);
		}
		return response;
	}

	// **********Ingredients*************
	@GetMapping(value = "/ingredients/list", produces = "application/json")
	// http://localhost:8084/api/pizza/ingredients/list
	public List<Ingredients> getAllIngredients() {
		System.out.println("**************Controller***********");
		return ingredientService.getIngridentsList();
	}

	// http://localhost:8084/api/pizza/pizzaingredients/add //new data
	@PostMapping("/pizzaingredients/add")
	public HttpStatus saveItems(@RequestBody Ingredients ingridens) {
		return ingredientService.addPizzaIngridients(ingridens) != null ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	};

	// http://localhost:8084/api/pizza/findingredients/1 //itemid
	@GetMapping("/findingredients/{ingredeientId}")
	public ResponseEntity<Ingredients> serachPizzaIngridients(@PathVariable(value = "ingredeientId") Long ingredeientId)

	{

		Ingredients ingridiens = ingredientService.serachPizzaIngridients(ingredeientId);
		return ResponseEntity.ok().body(ingridiens);

	}

	// http://localhost:8084/api/pizza/removeingredient/11
	@DeleteMapping("/removeingredient/{ingredeientId}")
	public Map<String, Boolean> deletePizzaIngridients(@PathVariable(value = "ingredeientId") Long ingredeientId) {
		Ingredients ingridients = ingredientService.serachPizzaIngridients(ingredeientId);
		Map<String, Boolean> response = new HashMap<>();
		if (ingridients != null) {
			ingredientService.deletePizzaIngridients(ingredeientId);
			response.put("deleted", Boolean.TRUE);
		}
		return response;
	}
	

}
