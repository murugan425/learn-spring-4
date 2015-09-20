/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 20, 2015
 * @time	: 11:51:15 AM
 */
package com.tamil.learnspring;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Murugan_Nagarajan
 *
 */
@Component
public class Person {

	private String userName;

	private BigDecimal mobileNumber;
	
	@Autowired
	@Value("${user.address}")
	private String userAddress;
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}


	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(BigDecimal mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	/**
	 * @param userAddress the userAddress to set
	 */
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person ["
				+ (userName != null ? "userName=" + userName + ", " : "")
				+ (mobileNumber != null ? "mobileNumber=" + mobileNumber + ", "
						: "")
				+ (userAddress != null ? "userAddress=" + userAddress : "")
				+ "]";
	}
	
	
}
