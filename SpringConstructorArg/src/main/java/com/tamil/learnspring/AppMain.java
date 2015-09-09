/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 9, 2015
 * @time	: 11:26:18 PM
 */
package com.tamil.learnspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tamil.learnspring.Person;


/**
 * @author Murugan_Nagarajan
 *
 */
public class AppMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/tamil/learnspring/config/SpringBeans.xml");
		Person personObj = (Person) context.getBean("person");
		System.out.println(" Person object from bean xml with Constructor Argument is " + personObj);
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
