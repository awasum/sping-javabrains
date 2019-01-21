package com.awasum.repository;

import java.util.List;

import com.awasum.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}