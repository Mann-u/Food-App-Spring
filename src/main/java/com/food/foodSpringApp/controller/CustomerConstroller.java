package com.food.foodSpringApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.foodSpringApp.dao.CustomerDao;
import com.food.foodSpringApp.dto.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerConstroller {
	
	@Autowired
	CustomerDao customerDao;
	
	@PostMapping
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerDao.saveCustomer(customer);
	}
	
	@GetMapping("/{email}")
	public Customer getCustomerByEmail(@PathVariable String email) {
		return customerDao.getCustomerByEmail(email);
	}

}
