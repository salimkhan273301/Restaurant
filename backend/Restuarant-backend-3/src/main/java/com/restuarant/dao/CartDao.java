package com.restuarant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restuarant.entity.Cart;

public interface CartDao extends JpaRepository<Cart, Integer> {

}
