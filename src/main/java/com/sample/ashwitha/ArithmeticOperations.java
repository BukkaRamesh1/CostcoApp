package com.sample.ashwitha;

import java.util.Scanner;

public class ArithmeticOperations {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        
        int sum = add(num1, num2);
        int diff = subtract(num1, num2);
        int prod = multiply(num1, num2);
        int remainder = 0;
        
        try {
            remainder = divide(num1, num2);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Remainder: " + remainder);
        
    }
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero not possible");
        }
        return a % b;
    }
}

