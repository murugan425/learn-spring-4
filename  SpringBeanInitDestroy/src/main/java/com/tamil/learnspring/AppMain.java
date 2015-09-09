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
		Person personObj1 = (Person) context.getBean("person");
		Person personObj2 = (Person) context.getBean("person");
		System.out.println(" Person object scope is singleton " + personObj1);
		System.out.println(" Person object scope is singleton " + personObj2);
		
		Address addressObj = (Address) context.getBean("addressBean");
		personObj1.setPanId("RANDOM PAN");
		addressObj.setCity("GET CITY NAME");

		System.out.println(" Person object scope is singleton " + personObj1);
		System.out.println(" Person object scope is singleton " + personObj2);
		((ClassPathXmlApplicationContext)context).close();
		
	}
	
	public void init() {
		System.out.println("Init Method in Main");
	};
	
	public void destroy() {
		System.out.println("Destory Method in Main");
	};

	
}
