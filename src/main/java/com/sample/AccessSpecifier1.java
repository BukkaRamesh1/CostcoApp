package com.sample;

public class AccessSpecifier1 {
	public static void addNumbers() {
		int a=9, b=5, c=a+b;
		System.out.println(" The sum of the 2 numbers is " +c);
	}
	private static void subNumbers() {
		int a=9, b=5, c=a-b;
		System.out.println(" The difference between the 2 numbers is " +c);
	}
	protected static void prodNumbers() {
		int a=9, b=5, c=a*b;
		System.out.println(" The product of the 2 numbers is " +c);
	}

	public static void main(String[] args) {
		
		addNumbers();
		subNumbers();
		prodNumbers();

	}

}
