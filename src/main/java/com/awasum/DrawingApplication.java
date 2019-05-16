package com.awasum;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	public static void main(String[] args) {

//		final Triangle triangle = new Triangle();
//		triangle.draw();
//
//		final BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//		Triangle beanTriangle = (Triangle) beanFactory.getBean("triangle");
//		beanTriangle.draw();

		final ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Triangle beanTriangle = (Triangle) applicationContext.getBean("triangle-alias");
		beanTriangle.draw();
	}

}
