package com.awasum.repository;

import java.util.ArrayList;
import java.util.List;

import com.awasum.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.awasum.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		
		//just a stub to show the concepts
		Customer customer = new Customer();
		customer.setFirstName("Tyrion");
		customer.setLastName("Lannister");
		
		customers.add(customer); 
		
		return customers;
	}
}
