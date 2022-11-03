package com.cartservice.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cartservice.main.model.Cart;
import com.cartservice.main.repository.CartRepository;

@Service
public class CartServicesImpl implements CartServices{
	
	@Autowired
	private CartRepository cartRepository;

	@Override
	public List<Cart> getAllCartList() {
		// TODO Auto-generated method stub
		return cartRepository.findAll();
	}

	@Override
	public Cart addToCart(Cart cart) {
		// TODO Auto-generated method stub
		return cartRepository.save(cart);
	}

	@Override
	public void deleteCart(int orderNumber) {
		Cart cart =cartRepository.findById(orderNumber).get();
		
		cartRepository.delete(cart);
		
	}
	
	

}
