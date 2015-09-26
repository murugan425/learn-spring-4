/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 26, 2015
 * @time	: 3:32:12 PM
 */
package com.tamil.learnspring.webmvc.model;

import java.sql.Timestamp;

/**
 * @author Murugan_Nagarajan
 *
 */
public class Actor {
	private Integer actorId;
	private String firstName;
	private String lastName;
	private Timestamp lastUpdatedTime;
	
	
	/**
	 * 
	 */
	public Actor() {
		
	}


	/**
	 * @param firstName
	 * @param lastName
	 */
	public Actor(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	/**
	 * @param actorId
	 * @param firstName
	 * @param lastName
	 * @param lastUpdatedTime
	 */
	public Actor(Integer actorId, String firstName, String lastName,
			Timestamp lastUpdatedTime) {
		this(firstName,lastName);
		this.actorId = actorId;
		this.lastUpdatedTime = lastUpdatedTime;
	}


	/**
	 * @return the actorId
	 */
	public Integer getActorId() {
		return actorId;
	}


	/**
	 * @param actorId the actorId to set
	 */
	public void setActorId(Integer actorId) {
		this.actorId = actorId;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the lastUpdatedTime
	 */
	public Timestamp getLastUpdatedTime() {
		return lastUpdatedTime;
	}


	/**
	 * @param lastUpdatedTime the lastUpdatedTime to set
	 */
	public void setLastUpdatedTime(Timestamp lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}
	
	
}
