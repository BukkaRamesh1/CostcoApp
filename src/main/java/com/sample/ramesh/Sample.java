package com.sample.ramesh;

import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Sample {
	
	
	
	/*
	 * Data types 
	 * 1. primitive    -- int // long , float // double , char // string 
	 * 2. non primitive
	 *     10.05 
	 * 
	 *  
	 *  Github   --- cloud to store the code // bitbucket and azure devops, SVN totoise 
	 *  
	 *  linux  --- environment to host the application 
	 *  
	 *  
	 *  create a merge request 
	 *  
	 *  Baisc operators
	 *  
	 *  
	 *  
	 *  collecions 
	 *  
	 *  
	 *  interfaces of collections
	 *  1. list  -- stores data and good at manipulations
	 *  2. set -- have data storing and wont save duplicates
	 *  3. map -- store data based on key value pair structure
	 *  
	 *  implmemtation classes upon interfaces
	 *  
	 *  1. linkedlist
	 *  2. Arraylist
	 *  
	 *   arraylist
	 *  
	 *  
	 *  
	 *  
	 *  1. Hashset
	 *  2. Linkedhashset
	 *  3. treeset
	 *  
	 *   
	 *   1. Hashmap
	 *   2. LinkedHashMap
	 *   3. TreeMap
	 * 
	 * 
	 * 
	 */
	
	static class Helper{
		private int data =5;
		public void bump(int inc) {
			inc++;
			data = data +inc;
		}
	}
	
	class MyOtherClass{
		FileReader aReader;
		
		MyOtherClass(){}
	}
	
	class MyCollection<T> {
		private Set<T> set;
		public Set<T> getCollection(){
			return this.set;
		}
	}
	
	
	public class IkmTest{
		public IkmTest() {
			this(10);
		}
		public IkmTest(int data ) {
			this.data = data;
		}
		public void display() {
			class Decrementer{
				public void decrementer() {
					data--;
				}
			}
			Decrementer d = new Decrementer();
			d.decrementer();
			System.out.println("data = "+data);
		}
		
		private int data;
	}
	

	
	public class ObjectDemo{
		@Override
		public String toString() {
			return "ObjectDemo";
		}
	}
	
	public static void main(String[] args) {
		
		
//		Optional<Object> o = Optional.of(new ObjectDemo());
//		System.out.println(o.get().toString());
		
		int j =0;
		int a[] = {2,4};
		do for(int i:a)
			System.out.print(i+ " ");
		while (j++ <1);
		
		
		
		
		int data1 =0;
		//IkmTest t = new IkmTest();
		//t.display();
		//System.out.println("data = "+data1);
		
		System.out.println("0,1");
		System.out.println(String.format("Local time: %tT", LocalTime.now()));
		// save 4 members data or iterate upon them
		//I have a data of 1000000 users
		
		// collections
		
//		int r =10, j=12;
//		for(;;) {
//			if(r++ < j--)
//				continue;
//			else break;
//			//System.out.println(r+ ""+j);
//		}
		
		//MyOtherClass ot = new MyOtherClass();
		
  Locale locale1 = new Locale("USA");
  System.out.println("Country: "+locale1.getCountry());
		
		Supplier<String> u = () -> "car";
		Consumer<String> c = x-> System.out.print(x.toLowerCase());
		Consumer<String> d = x-> System.out.print(x.toUpperCase());
		c.andThen(d).accept(u.get());
		System.out.println();
		
		
		
		byte c1[] = {10,20,30,40,50};
		byte c2[] = {60,70,80,90};
		
		ByteArrayOutputStream b1 = new ByteArrayOutputStream();
		ByteArrayOutputStream b2 = new ByteArrayOutputStream(10);
		b2.write(100);
		System.out.println("" +b2.size());
		b2.write(c1,0,c2.length);
		System.out.println("" +b2.size());
		
		
		Long l = new Long(1234);
		Long ll = l;
		if(l==11) {
			System.out.println("equal");
		} else {
			System.out.println("not");
		}
		l++;
		if(l==11) {
			System.out.println("equal");
		} else {
			System.out.println("not");
		}
		
		
		System.out.println(Stream.of("green", "yellow", "blue")
				.max((s1,s2) ->s1.compareTo(s2))
				.filter(s->s.endsWith("n"))
				.orElse("yellow")
				);
		
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add(0,"3");
		list.add(1, "4");
		list.forEach(System.out::println);
		
		Set<String> set = new LinkedHashSet<String>();
		set.add("3");
		set.add("1");
		set.add("3");
		set.add("2");
		set.add("3");
		set.add("1");
		set.forEach(s->System.out.println(s+"-"));
 		
		
		Helper h = new Helper();
		int data = 2;
		h.bump(data);
		System.out.println(h.data + " "+data);
		
		Integer n1 = new Integer(1);
		Integer n2 = n1;
		
		n1+=1;
		System.out.println(n1);
		System.out.println(n2);
		
		Integer x = 3;
		Integer y = null;
		try {
			System.out.println(Integer.compareUnsigned(x, 3) ==0 || Integer.compareUnsigned(y, 0)==0);
		}catch(Exception e) {
			e.printStackTrace();
		}try {
			System.out.println(y.compareTo(null)==0 ||true);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		LocalDate ld = LocalDate.of( 2018 , Month.AUGUST , 30 );

		Locale locale = Locale.US;
		DateTimeFormatter f = DateTimeFormatter.ofPattern( "E d MMM yyyy" , locale );
		String output = ld.format( f );

		System.out.println( output );
		
		
		
		String[] names = {"Ramesh", "Ashwitha", "lovika", "abdel", "pavani"};
	     
		//standard for loop
		for (int i = 0; i < names.length; i++) {
			//System.out.println(names[i]);
		}
		
		//for each loop
		for (String name : names) {
			//System.out.println(name);
			
		}
		
		List<String> nam = new ArrayList<String>();
		nam.add("Ramesh");
		nam.add("Ashwitha");
		nam.add("Lovika");
		nam.add("Abdel");
		nam.add("Pavani");
		nam.add("Ramesh");
		nam.add("Ramesh");
		nam.add("Ramesh");
		nam.add("Ramesh");
		nam.add("lovika");
		nam.add("lovika");
		
		List<String> nam1 = new LinkedList<String>();
		
		
		Set<String> s = new TreeSet <String>(nam);
		/*
		 * 
		 * Hashset saves the data in random order
		 * linkedhasset stores the data in insertion order
		 * treeset is natural sorting order
		 *  
		 * 
		 */
		
		for(String n: s) {
			System.out.println(n);
		}
		
		
		// LinkedHashMap and TreeMap
		Map<Integer, String> userData = new HashMap<Integer, String>();
		
		userData.put(1, "Ramesh");
		userData.put(2, "Abdel");
		for(Map.Entry m: userData.entrySet() ) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		
		
	}
	
	

	

}
