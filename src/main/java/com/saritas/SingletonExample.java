package com.saritas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * mesut.saritas
 *
 */
public class SingletonExample {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-person.xml");

		Person person = (Person) applicationContext.getBean("person");
		System.out.println("Name Value :" + person.getName());
		person.setName("Mesut...");
		System.out.println("Name Before Set Value: " + person.getName());

		// retrieve it again
		Person personB = (Person) applicationContext.getBean("person");
		System.out.println("Name Value :" + personB.getName());
	}
}
