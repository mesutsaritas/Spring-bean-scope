package com.saritas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeExample {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-person2.xml");

		Customer customer = (Customer) applicationContext.getBean("customer");
		customer.setName("Mesut");
		System.out.println("Name Value: " + customer.getName());
		/*
		 * In prototype scope, you will have a new instance for each getBean()
		 * method called.
		 */
		Customer customerB = (Customer) applicationContext.getBean("customer");
		System.out.println("Name Value: " + customerB.getName());
	}

}
