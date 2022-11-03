package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	ProductRepository productRepository;
	
	public Product saveUser(Product product) {
		
		return productRepository.save(product);
		
	}
}
