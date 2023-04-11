package com.sample.test;

import com.sample.ramesh.Test;
import com.sample.ramesh.User;

public class CheckAccessSpec {
	
	public static void main(String[] args) {
		Test t = new Test();
		
		User u = new User("ramesh", "VA");   // object 1
		System.out.println(u.getUserName());
		System.out.println(u.getUserAddress());
		
		User u1 = new User();  // object 2
		u1.getUserName(); // null or empty
		
	}

}
