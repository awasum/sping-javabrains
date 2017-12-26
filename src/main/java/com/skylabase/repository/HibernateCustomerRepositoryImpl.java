package com.skylabase.repository;

import java.util.ArrayList;
import java.util.List;

import com.skylabase.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.skylabase.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstName("Tyrion");
		customer.setLastName("Lannister");
		
		customers.add(customer);
		
		return customers;
	}
}
