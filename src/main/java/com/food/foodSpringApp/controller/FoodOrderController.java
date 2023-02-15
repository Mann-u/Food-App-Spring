package com.food.foodSpringApp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.food.foodSpringApp.dao.FoodOrderDao;
import com.food.foodSpringApp.dto.FoodOrder;

@RestController
@RequestMapping("/foodOrders")
public class FoodOrderController {

	@Autowired
	FoodOrderDao foodOrderDao;

	@PostMapping
	public FoodOrder placeFoodOrder(@RequestBody FoodOrder foodOrder) {
		return foodOrderDao.saveFoodOrder(foodOrder);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping
	public FoodOrder getFoodOrderById(@RequestParam int id) {
		Optional<FoodOrder> result = foodOrderDao.getFoodOrderById(id);
		if (result.isPresent()) {
			return result.get();
		} else {
			return null;
		}
	}

}
