/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 12, 2015
 * @time	: 11:39:32 AM
 */
package com.tamil.learnspring;

/**
 * @author Murugan_Nagarajan
 *
 */
public class SkillSet {
	private String technologyName;
	private String technologyCategory;
	/**
	 * @return the technologyName
	 */
	public String getTechnologyName() {
		return technologyName;
	}
	/**
	 * @param technologyName the technologyName to set
	 */
	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}
	/**
	 * @return the technologyCategory
	 */
	public String getTechnologyCategory() {
		return technologyCategory;
	}
	/**
	 * @param technologyCategory the technologyCategory to set
	 */
	public void setTechnologyCategory(String technologyCategory) {
		this.technologyCategory = technologyCategory;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SkillSet ["
				+ (technologyName != null ? "technologyName=" + technologyName
						+ ", " : "")
				+ (technologyCategory != null ? "technologyCategory="
						+ technologyCategory : "") + "]";
	}
	
	
}
