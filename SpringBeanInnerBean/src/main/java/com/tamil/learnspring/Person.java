/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 9, 2015
 * @time	: 11:26:36 PM
 */
package com.tamil.learnspring;

/**
 * @author Murugan_Nagarajan
 *
 */
public class Person {

	private int userId;
	private String userName;
	private String panId;
	private Address addressDetail;

	/**
	 * @param userId
	 * @param userName
	 */
	public Person(int userId, String userName) {
		System.out.println("Constructor Triggered... "+ this.getClass().getName());
		this.userId = userId;
		this.userName = userName;
	}

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
	public void setPanId(String panId) {
		this.panId = panId;
	}

	/**
	 * @return the addressDetail
	 */
	public Address getAddressDetail() {
		return addressDetail;
	}

	/**
	 * @param addressDetail the addressDetail to set
	 */
	public void setAddressDetail(Address addressDetail) {
		this.addressDetail = addressDetail;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [userId="
				+ userId
				+ ", "
				+ (userName != null ? "userName=" + userName + ", " : "")
				+ (panId != null ? "panId=" + panId + ", " : "")
				+ (addressDetail != null ? "addressDetail=" + addressDetail
						: "") + "]";
	}
	
	public void createPerson() {
		System.out.println("Trigger/Create the required mandatory elements before "+this.getClass().getName()+ " Object");
	}
	
	public void destoryPerson() {
		System.out.println("Trigger/Destroy the created elements after using Person "+this.getClass().getName()+ " Object");
	}
}
