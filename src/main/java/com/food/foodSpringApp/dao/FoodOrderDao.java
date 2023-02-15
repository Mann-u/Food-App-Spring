package com.food.foodSpringApp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.food.foodSpringApp.dto.FoodOrder;
import com.food.foodSpringApp.dto.Iteam;
import com.food.foodSpringApp.repository.FoodOrderRepo;
import com.food.foodSpringApp.repository.IteamRepo;

@Repository
public class FoodOrderDao {
	@Autowired
	FoodOrderRepo foodOrderRepo;

	@Autowired
	IteamRepo iteamRepo;

	public FoodOrder saveFoodOrder(FoodOrder foodOrder) {
		List<Iteam> listOfItems = foodOrder.getItems();
		List<Iteam> res = new ArrayList<>();
		if (listOfItems.isEmpty()) {
			foodOrder = foodOrderRepo.save(foodOrder);
		} else {
			foodOrder = foodOrderRepo.save(foodOrder);
			for (Iteam iteam : listOfItems) {
				iteam.setFoodorder(foodOrder);
				res.add(iteamRepo.save(iteam));
			}
			foodOrder.setItems(res);
		}
		return foodOrder;
		
		 
	}

	public Optional<FoodOrder> getFoodOrderById(int id) {
		return foodOrderRepo.findById(id);
	}

	public List<FoodOrder> getAllFoodOrder() {
		return foodOrderRepo.findAll();
	}

	public FoodOrder updateFoodOrder(FoodOrder foodOrder) {
		return foodOrderRepo.save(foodOrder);
	}

	public void deleteFoodOrder(int id) {
		foodOrderRepo.deleteById(id);
	}

}
