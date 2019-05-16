package com.awasum;

import com.awasum.service.CustomerService;
import com.awasum.service.CustomerServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApplication {

	public static void main(String[] args) {
		
		CustomerService customerService = new CustomerServiceImpl();
		
		System.out.println(customerService.findAll().get(0).getFirstName());

		final Triangle triangle = new Triangle();
		triangle.draw();

		final BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle beanTriangle = (Triangle) beanFactory.getBean("triangle");
		beanTriangle.draw();
	}

}
