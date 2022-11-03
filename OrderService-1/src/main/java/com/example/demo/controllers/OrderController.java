package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Order;
import com.example.demo.repositories.OrderRepository;


@RestController
public class OrderController {
	
	private OrderRepository repo;
	@Autowired
	public OrderController(OrderRepository repo) {
		this.repo = repo;
		
	}
	@PostMapping("/api/orders")
	public Order createorder(@RequestBody Order order) {
		return repo.save(order);
	}
	@GetMapping("api/orders/{id}")
	public java.util.Optional<Order> findOrderById(@PathVariable Long id) {
		return repo.findById(id);
	}
	

}
