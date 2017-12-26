package com.skylabase.service;

import java.util.List;

import com.skylabase.model.Customer;
import com.skylabase.repository.CustomerRepository;
import com.skylabase.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	//hardcoded object been passed
	//Spring will fix this for us
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.skylabase.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
