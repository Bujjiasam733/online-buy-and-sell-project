package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.payment.*;
import com.example.paymentrepository.PaymentRepository;
@RequestMapping
public class PaymentController {

	@RestController
	public class CompanyController {
		@Autowired
		private PaymentRepository repo;
		// Get All Notes
		@GetMapping("/payment")
		public List<Payment> getAllNotes()
		{
			return ((PaymentRepository) repo).findAll();
		}
		
		}
	}
		
