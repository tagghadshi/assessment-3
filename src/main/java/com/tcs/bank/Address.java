package com.tcs.bank;

public class Address {
	private String houseNumber;
	private String street;
	private String city;
	private String state;
	private int pincode;
	private long phoneNumber;
	public Address(String houseNumber, String street, String city, String state, int pincode, long phoneNumber) {
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.phoneNumber = phoneNumber;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public int getPincode() {
		return pincode;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	
}
