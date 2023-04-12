package com.sample.abdel;

public class Customer {
	
	private String customerName;
	public String customerAddress;
	private Integer customerNumber;
	
	public Customer() {
		System.out.println("customer constructor");
	}
	public Customer(String name) {
		this.customerName = name;
	}
	public Customer(String name, String address) {
		this.customerName = name;
		this.customerAddress = address;
	}
	
	
	public static int addNumbers() {
		int a = 4, b = 5, c=a+b;
		System.out.println("The value of c is : "+c);
		return c;
		
	}
	
	public static void main(String[] args) {
		
		addNumbers();
		
		System.out.println("Hello");
		
	}
	
	

}
