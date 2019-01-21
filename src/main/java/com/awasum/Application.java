package com.awasum;

import com.awasum.service.CustomerService;
import com.awasum.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		CustomerService customerService = new CustomerServiceImpl();
		
		System.out.println(customerService.findAll().get(0).getFirstName());

	}

}
