package com.restuarant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restuarant.entity.Item;

public interface ItemDao extends JpaRepository<Item, Integer> {

}