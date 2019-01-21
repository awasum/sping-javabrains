package com.awasum.service;

import java.util.List;

import com.awasum.model.Customer;
import com.awasum.repository.CustomerRepository;
import com.awasum.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	//hardcoded object been passed
	//Spring will fix this for us
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.awasum.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
