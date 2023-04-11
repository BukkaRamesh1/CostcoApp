package com.sample.ramesh;

public class User {
	
	
	private String userName;
	
	private String userAddress;
	
	private Integer userNumber;
	
	// default constructor
	public User(){
		System.out.println("user constructor");
		// x y z operations to be done when the user object is created 
		// i wont call them explicitly
	}
	
	// constructor with single param
	public User(String name) {
		this.userName = name;   // setting a value to variable using constructor
		System.out.println("user constructor with single param triggered");
	}
	
	//constructor with multiple params
	public User(String name, String address) {
		System.out.println("user constructor with multiple param triggered");

		this.userName = name;  // this is a keyword refers to current object 
		this.userAddress = address;
		
	}
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public Integer getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(Integer userNumber) {
		this.userNumber = userNumber;
	}
	
	
	
	
	
	
	

}
