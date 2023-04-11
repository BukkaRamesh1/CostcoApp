package com.sample.ramesh;

public class Test {
	
	/*
	 * 
	 * 
	 * 
	 *   Java 
	 *   Eclipse
	 *   Mysql DB
	 *   Git
	 *   Postman
	 *   
	 *   
	 *   
	 *   
	 * 
	 * Java installed in out system 
	 * It contains JRE and JDK
	 * env java path and adding to class path the JDK and JDK bin
	 * It converts teh machine code to class file and executes the coce it contains binary code 010100100
	 * 
	 * 
	 *   access specifier   -- public, private, protected
	 *   public - any pne can access entire the application
	 *   private -- it can be accessed only inside the class -- we will create a public getters and setters methods to the variables
	 *   protected  -- we can access it trough the entire package
	 *   
	 *   public -- acccess specifier
	 *   static -- key word 
	 *   void -- return type for your method 
	 *   
	 *    static methods will only read the static variabls and methods 
	 *    
	 *   variables -- 
	 *   
	 *   local
	 *   global 
	 *   default 
	 *   static 
	 * 
	 *   constructors
	 *   
	 *   
	 *   operators  -- 
	 *     Arithmetic operator  -- (+, -, *, %, /, increment and decrement   ++, --)
	 *     relational   (==, !=, >, <, <=, >=) 
	 *     logical    (&& ,  || ,  !)
	 *     Assignment ( =, +=, -=, *=, )
	 *     misc -- conditional operator   ( ? : )  -- ternary operator 
	 *     
	 *     
	 *     int a= 10;
	 *     
	 *     b = (a == 1) ? 20:21;
	 *     
	 *    
	 *    
	 *    Control loops   -- for, while, do while,
	 *    
	 *    while   -- it just test the condition and executes the body of loop first 
	 *    while(boolean_expression){
	 *    statments
	 *    }
	 *    
	 *    for(initialize variabe : condition check; incemet/decreemt){
	 *    }
	 *    
	 *    do{
	 *    perform operations
	 *    } while();
	 *    
	 *    
	 *    decision making statments  -- if, if else, if else if, switch , nested if
	 *    Exceptions 
	 *    
	 *    
	 *    //4 conditions to check 
	 * 
	 *    if (condition1 && conditon4) {
	 *      // operations
	 *    } else if(condition2  condition5){
	 *       // tge operations
	 *    } else if(condition 3){
	 *    
	 *    } else {
	 *    
	 *    }
	 *     
	 *     
	 *     "the name is ramesh"
	 *     
	 *    
	 *    if(a){
	 *    if(b){
	 *    
	 *    }
	 *    }
	 *    
	 *    switch(expression){
	 *        case value:
	 *         // statments operations
	 *         break;
	 *         
	 *         case value:
	 *         // statments operations
	 *         break;
	 *         
	 *         case value:
	 *         // statments operations
	 *         break;
	 *         
	 *         case value:
	 *         // statments operations
	 *         break;
	 *         
	 *         case value:
	 *         // statments operations
	 *         break;
	 *         
	 *         case value:
	 *         // statments operations
	 *         break;
	 *         
	 *         case value:
	 *         // statments operations
	 *         break;
	 *         
	 *         case value:
	 *         // statments operations
	 *         break;
	 *         
	 *         default : 
	 *          // statment
	 *         
	 *    }
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
	private String name = "ramesh";   //
	public String address = "VA";
	protected String number = "1234456";
	
	static String code ;  // global varibale   always defined out side methods and inside class
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	public static void subNumbers() {
		int a = 5, b= 9 , c= b-a;
		
		
	    int n= 10;
		// variable x = (expression/logic) ? valiue is true:  value is false 
		b = (n == 1) ? 20:21;
		
		//loops
		
		
//		while(n<20) {
//			System.out.println("insie while loop");
//			n++;
//		}
		
		
		do {
			System.out.println("insie do  while loop");
			n++;
			
		} while (n<20);
		
//		for( n=10; n<20; n++) {
//			System.out.println("insie for loop");
//
//		}
		
		
		
		//decison making statment
		if(n<20) {
			//x op
			System.out.println("insie if statment");
		}
		
		
		String name = "Ramesh";
		
		
		
		System.out.println(b); //21
		
		String s = "Ramesh";
		String t = "Syed";
		
		
		if (s == name) {
			System.out.println("both the srting are equal");
			if(s == t) {
				System.out.println("both s and t are same");
			}
		} else if(s == t)  {
			System.out.println("both are not same");
		}
		
		
		
		boolean q= true;
		boolean y = false;
		
		s.length();//
		
		char[] ch = s.toCharArray();
		
		char w = 'Z';
		
		System.out.println(ch[3]);
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		switch (w) {
		case 'a' :
			System.out.println("condition match ");
			break;
		
		case 'b':
			System.out.println("condition doesnt match ");
			break;
		
			default :
				System.out.println("Invalid input");
		
		}
		
		
		if (!q || y) {
			System.out.println("both are equals");
		} else {
			System.out.println("both are not equal ");
		}
		
				
		
		
		System.out.println(a);  // 5
		a++;
		System.out.println(a); // 6
		a--;
		System.out.println(a); //5
		
		code = "2017";   // variable and data initilased to it its own method that is local variable the scope cant be aceesed outsside the methd
		System.out.println(c);
	}
	
	public static int addNumbers() {
		int a = 4, b=5, c=a+b;
		System.out.println("The value of c is : "+c);
		String s;
		code = "123";
		
		return c;
	}
	
	
	public static void main(String[] args) {
		
		//addNumbers();
		subNumbers();
		System.out.println("Hello");
		
	}

}
