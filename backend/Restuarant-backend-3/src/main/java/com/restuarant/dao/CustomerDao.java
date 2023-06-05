package com.restuarant.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.restuarant.entity.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer> {
	
	
	
	@Query(value="select count(*) from Customer c where c.c_email=?1 and c.c_password=?2",nativeQuery=true)
	int verifyCredentials(String email, String password);
	
	@Query(value = "select * from Customer a where a.c_email = ?1 and a.c_password = ?2", nativeQuery = true)
	Customer findByEmailAndPass(String email,String pass);

}