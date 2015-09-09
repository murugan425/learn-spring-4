/**
 * @author	: Murugan_Nagarajan
 * @date	: Sep 11, 2015
 * @time	: 9:08:29 PM
 */
package com.tamil.learnspring;

/**
 * @author Murugan_Nagarajan
 *
 */
public class Address {

	private String addressLine1;
	private String addressLine2;
	private String city;
	private String pinCode;
	
	/**
	 * @param addressLine1
	 * @param addressLine2
	 * @param city
	 * @param pinCode
	 */
	public Address(String addressLine1, String addressLine2, String city,
			String pinCode) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.pinCode = pinCode;
		System.out.println("Constructor Triggered... "+ this.getClass().getName());
	}
	
	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}
	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}
	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the pinCode
	 */
	public String getPinCode() {
		return pinCode;
	}
	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address ["
				+ (addressLine1 != null ? "addressLine1=" + addressLine1 + ", "
						: "")
				+ (addressLine2 != null ? "addressLine2=" + addressLine2 + ", "
						: "") + (city != null ? "city=" + city + ", " : "")
				+ (pinCode != null ? "pinCode=" + pinCode : "") + "]";
	}
	
	public void onCreateAddressObject() {
		System.out.println("Trigger/Create the required mandatory elements before "+this.getClass().getName()+ " Object");
	}
	
	public void onDestoryAddressObject() {
		System.out.println("Trigger/Destroy the created elements after using Person "+this.getClass().getName()+ " Object");
	}
	
	public void init() {
		System.out.println("Init Method in Address");
	};
	
	public void destroy() {
		System.out.println("Destory Method in Address");
	};
	public void initializeMethod() {
		System.out.println("Init Method in : " + this.getClass().getName());
	};
	
	public void destroyMethod() {
		System.out.println("Destory Method in : " + this.getClass().getName());
	};
}
