/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 9, 2015
 * @time	: 11:26:36 PM
 */
package com.tamil.learnspring;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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
	private Map<String, String> familyMembers = new HashMap<String, String>();
	private Map<String, SkillSet> skillSetMap = new LinkedHashMap<String, SkillSet>();
	private Map<String, List<SkillSet>> skillSetGrouped = new LinkedHashMap<String, List<SkillSet>>();
	
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

	/**
	 * @return the familyMembers
	 */
	public Map<String, String> getFamilyMembers() {
		return familyMembers;
	}

	/**
	 * @param familyMembers the familyMembers to set
	 */
	public void setFamilyMembers(Map<String, String> familyMembers) {
		this.familyMembers = familyMembers;
	}

	/**
	 * @return the skillSetMap
	 */
	public Map<String, SkillSet> getSkillSetMap() {
		return skillSetMap;
	}

	/**
	 * @param skillSetMap the skillSetMap to set
	 */
	public void setSkillSetMap(Map<String, SkillSet> skillSetMap) {
		this.skillSetMap = skillSetMap;
	}
	
	/**
	 * @return the skillSetGrouped
	 */
	public Map<String, List<SkillSet>> getSkillSetGrouped() {
		return skillSetGrouped;
	}

	/**
	 * @param skillSetGrouped the skillSetGrouped to set
	 */
	public void setSkillSetGrouped(Map<String, List<SkillSet>> skillSetGrouped) {
		this.skillSetGrouped = skillSetGrouped;
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
		sb.append("Family Members::::::::::::::"+ "\n");
		for(Entry<String, String> familyMember :familyMembers.entrySet()) {
			sb.append(familyMember.getKey() +" : " + familyMember.getValue() + "\n");
		}
		sb.append("Map of Skillset Object::::::::::::::"+ "\n");
		for(Entry<String, SkillSet> skillSet :skillSetMap.entrySet()) {
			sb.append(skillSet.getKey() +" : " + skillSet.getValue() + "\n");
		}
		
		//TODO : Not able to implement right now..,
		sb.append("Map of Grouped Skillset Objects::::::::::::::"+ "\n");
		sb.append("Not able to implement right now..,");
		for(Entry<String, List<SkillSet>> skillSetGroups :skillSetGrouped.entrySet()) {
			sb.append(skillSetGroups.getKey() +" : " + skillSetGroups.getValue() + "\n");
		}
		return sb.toString();
	}
	
	
}
