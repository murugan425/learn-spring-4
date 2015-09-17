/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 17, 2015
 * @time	: 9:14:08 PM
 */
package com.tamil.learnspring.spel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * @author Murugan_Nagarajan
 *
 */
@Component
public class Person {
	
	private int userId;
	private String userName;
	private String panId;
	private String greeting;

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the panId
	 */
	public String getPanId() {
		return panId;
	}

	/**
	 * @param panId the panId to set
	 */
	@Autowired
	public void setPanId(@Value("#{random.nextInt(90000)+10000}")String panId) {
		this.panId = panId;
	}

	/**
	 * @return the greeting
	 */
	public String getGreeting() {
		return greeting;
	}

	/**
	 * @param greeting the greeting to set
	 */
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [userId="
				+ userId
				+ ", "
				+ (userName != null ? "userName=" + userName : "")
				+ " says "+ (greeting != null ? greeting + ", " : "")
				+ (panId != null ? "panId=" + panId : "")
				+ "]";
	}

	
}
