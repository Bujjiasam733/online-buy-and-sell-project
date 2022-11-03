package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@RestController
@RequestMapping("/products")
public class Controller {
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/saveProduct")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product){
		return new ResponseEntity<Product>(productRepository.save(product), HttpStatus.CREATED);
		
	}

}
