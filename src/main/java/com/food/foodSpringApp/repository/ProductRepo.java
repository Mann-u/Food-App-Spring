package com.food.foodSpringApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.foodSpringApp.dto.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
