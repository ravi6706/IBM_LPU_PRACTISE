package com.example.demo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Account;

@Repository
public interface AccountDAO extends CrudRepository<Account, Integer>{
	
	@Query
	public Account findById(int id);
	public Account findByCustomerId(String customerId);

}
