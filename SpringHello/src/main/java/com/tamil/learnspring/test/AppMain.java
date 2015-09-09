/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 9, 2015
 * @time	: 4:05:20 PM
 */
package com.tamil.learnspring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Murugan_Nagarajan
 *
 */
public class AppMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Usual way to create a instance object in JAVA.
		/*Person personObj = new Person();
		personObj.speak();*/
		
		//Spring way by Dependency Injection
		
		//1. Using FileSystemXmlApplicationContext
		//ApplicationContext context = new FileSystemXmlApplicationContext("SpringBeans.xml");
		
		//2. Using ClassPathXmlApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("com/tamil/learnspring/config/SpringBeans.xml");
		Person personObj = (Person) context.getBean("person");
		personObj.speak();
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
