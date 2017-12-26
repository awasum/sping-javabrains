package com.skylabase.repository;

import java.util.List;

import com.skylabase.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}