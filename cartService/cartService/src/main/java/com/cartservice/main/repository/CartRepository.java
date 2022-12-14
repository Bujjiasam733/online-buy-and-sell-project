package com.cartservice.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cartservice.main.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{

}
