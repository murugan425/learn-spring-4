/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 20, 2015
 * @time	: 7:39:13 PM
 */
package com.tamil.learnspring.model;

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
		this.lastUpdatedTime = new Timestamp(System.currentTimeMillis());
	}


	/**
	 * @param firstName
	 * @param lastName
	 * @param lastUpdatedTime
	 */
	public Actor(String firstName, String lastName, Timestamp lastUpdatedTime) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastUpdatedTime = lastUpdatedTime;
	}
	
	
	/**
	 * @param actorId
	 * @param firstName
	 * @param lastName
	 * @param lastUpdatedTime
	 */
	public Actor(Integer actorId, String firstName, String lastName,
			Timestamp lastUpdatedTime) {
		this(firstName,lastName,lastUpdatedTime);
		this.actorId = actorId;		
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
	 * @return the lastUpdatedTime
	 */
	public String getLastUpdatedTimeStr() {
		return this.lastUpdatedTime==null?null:this.lastUpdatedTime.toString();
	}
	
	/**
	 * @param lastUpdatedTime the lastUpdatedTime to set
	 */
	public void setLastUpdatedTime(Timestamp lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", lastUpdatedTime="
				+ lastUpdatedTime + "]";
	}
	
	
}
