package com.example.discount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.discount.model.Order;
import com.example.discount.service.DiscountExampleService;

@RestController
public class DiscountExampleController {
	
	@Autowired
	private DiscountExampleService discountExampleService;
	
	@PostMapping(value = "/getPayableAmount")
	public ResponseEntity<Integer> getPayableAmount(@RequestBody Order order) {
		
		int payableAmount = discountExampleService.calculateDiscount(order);
		
		return ResponseEntity.ok(payableAmount);		
	}

}
