package com.food.foodSpringApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.foodSpringApp.dto.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	Customer findByEmail(String email);
}
