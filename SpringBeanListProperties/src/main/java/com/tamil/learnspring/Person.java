/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 9, 2015
 * @time	: 11:26:36 PM
 */
package com.tamil.learnspring;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

/**
 * @author Murugan_Nagarajan
 *
 */
public class Person {

	private int userId;
	private String userName;
	private String panId;
	private Address addressDetail;
	private Set<BigDecimal> mobileNumbers;
	private List<SkillSet> skillSets;

	/**
	 * @param userId
	 * @param userName
	 */
	public Person(int userId, String userName) {
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

	/**
	 * @return the mobileNumbers
	 */
	public Set<BigDecimal> getMobileNumbers() {
		return mobileNumbers;
	}

	/**
	 * @param mobileNumbers the mobileNumbers to set
	 */
	public void setMobileNumbers(Set<BigDecimal> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}

	/**
	 * @return the skillSets
	 */
	public List<SkillSet> getSkillSets() {
		return skillSets;
	}

	/**
	 * @param skillSets the skillSets to set
	 */
	public void setSkillSets(List<SkillSet> skillSets) {
		this.skillSets = skillSets;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("userId="+ userId);
		sb.append("\n");
		sb.append(userName != null ? "userName=" + userName + ", " : "");
		sb.append("\n");
		sb.append(panId != null ? "panId=" + panId + ", " : "");
		sb.append("\n");
		sb.append("Mobile Numbers::::::"+ "\n");
		for (BigDecimal mobNum : mobileNumbers) {
			sb.append(mobNum + "\n");
		}
		sb.append("Skill Sets:::::::::::"+ "\n");
		for(SkillSet skill :skillSets) {
			sb.append(skill.getTechnologyName() != null ? "Technology Name=" + skill.getTechnologyName() + ", ":"");
			sb.append(skill.getTechnologyCategory() != null ? "Technology  Category=" + skill.getTechnologyCategory() + ", " :"");
			sb.append("\n");
		}
		return sb.toString();
	}
	
	
}
