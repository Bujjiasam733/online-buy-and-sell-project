package com.cartservice.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cartservice.main.model.Cart;
import com.cartservice.main.service.CartServices;

@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = "*")
public class CartController {
	
	@Autowired
	private CartServices cartServices;
	
	@GetMapping("/check")
	public String check() {
		return "hello";
	}
	
	@GetMapping("getAll")
	public ResponseEntity<List<Cart>> getAllCart(){
		return new ResponseEntity<List<Cart>>(cartServices.getAllCartList(), HttpStatus.OK);
	}
	
	@PostMapping("/addNew")
    public ResponseEntity<Cart> registerNewUser(@RequestBody Cart cart) {
        
            return new ResponseEntity<Cart>(cartServices.addToCart(cart), HttpStatus.OK);
       
    }
	
	 @DeleteMapping("/delete/{cartId}")
	    public ResponseEntity<?> deleteCart(@PathVariable int orderNumber){
	        this.cartServices.deleteCart(orderNumber);
	        return new ResponseEntity<>("Sender Email deleted successfully", HttpStatus.OK);
	    }

}
