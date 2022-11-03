package com.cartservice.main.service;

import java.util.List;

import com.cartservice.main.model.Cart;

public interface CartServices {

	List<Cart> getAllCartList();

	Cart addToCart(Cart cart);

	void deleteCart(int orderNumber);

}
