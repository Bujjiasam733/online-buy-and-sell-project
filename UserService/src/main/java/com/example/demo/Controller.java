package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

import antlr.collections.List;

@RestController
@RequestMapping("/users")
public class Controller {

	@Autowired	
	UserRepository userRepository;

	@PostMapping("/saveUser")
	public ResponseEntity<User> saveUser(@RequestBody User user)
	{
		return new ResponseEntity<User> (userRepository.save(user), HttpStatus.CREATED);

	}

	@GetMapping("/user")
	public List getAllEmployees() {

		return (List) userRepository.findAll();
	}	

	@GetMapping("/user/{id}")
	public ResponseEntity<User> getCustomer(@PathVariable Integer id)
	{
		Optional<User> user = userRepository.findById(id);

		if (user.isPresent()) 
		{
			return new ResponseEntity<>(user.get(), HttpStatus.OK);
		}

		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
}
