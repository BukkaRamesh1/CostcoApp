package com.sample.ashwitha;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class List1 {

	public static void main(String[] args) {
		
		System.out.println("Enter the no of students in the class");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		List<String> studentList = new ArrayList<String>();
		
		for(int i=0; i<n; i++){
			System.out.println("Enter name of student "+(i+1));
			String studentName = sc.next();
			studentList.add(studentName);	
		}
		System.out.println();
		System.out.println("Student names:");
		for(String name:studentList) {
			System.out.println(name);
		}
		
		Set<String> studentSet = new TreeSet<String>(studentList);
		System.out.println();
		System.out.println("The names in alphabetical order are :");
		for(String name: studentSet) {
			System.out.println(name);
		}
			sc.close();
	}

}
