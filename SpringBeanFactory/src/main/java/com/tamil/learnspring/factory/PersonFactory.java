/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 12, 2015
 * @time	: 9:25:10 AM
 */
package com.tamil.learnspring.factory;

import com.tamil.learnspring.Person;

/**
 * @author Murugan_Nagarajan
 *
 */
public class PersonFactory {

	public Person createPerson(int userId, String userName) {
		System.out.println("Factory Bean is used to create the Person objects..,");
		return new Person(userId, userName);
	}
}
