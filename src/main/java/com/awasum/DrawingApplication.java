package com.awasum;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	public static void main(String[] args) {

//		final Triangle triangle = new Triangle();
//		triangle.draw();
//
//		final BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//		Triangle beanTriangle = (Triangle) beanFactory.getBean("triangle");
//		beanTriangle.draw();

		final AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		applicationContext.registerShutdownHook();
		Triangle beanTriangle = (Triangle) applicationContext.getBean("triangle");
		beanTriangle.draw();
	}

}
