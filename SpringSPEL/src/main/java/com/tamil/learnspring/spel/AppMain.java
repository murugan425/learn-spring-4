/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 17, 2015
 * @time	: 9:38:20 PM
 */
package com.tamil.learnspring.spel;

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
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		Person person = (Person)context.getBean("person");
		System.out.println(person.toString());
		((ClassPathXmlApplicationContext)context).close();
	}

}
