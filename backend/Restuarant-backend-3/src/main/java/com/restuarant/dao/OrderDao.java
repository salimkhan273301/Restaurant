package com.restuarant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restuarant.entity.Orders;

public interface OrderDao extends JpaRepository<Orders, Integer> {

}