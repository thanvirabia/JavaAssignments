package com.deloitte;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
		int choice;
        while(true) {
        	choice = getChoice(scan);
        	int first,second;
            switch (choice) {
    		case 1:
    			System.out.println("Enter the numbers");
            	first = scan.nextInt();
            	second = scan.nextInt();
    			System.out.println("The sum of "+first+" and "+second+" is : "+add(first,second));
    			break;
    		case 2:
    			System.out.println("Enter the numbers");
            	first = scan.nextInt();
            	second = scan.nextInt();
    			System.out.println("The difference of "+first+" and "+second+" is : "+subtract(first,second));
    			break;
    		case 3:
    			System.out.println("Enter the numbers");
            	first = scan.nextInt();
            	second = scan.nextInt();
    			System.out.println("The product of "+first+" and "+second+" is : "+multiply(first,second));
    			break;
    		case 4:
    			System.out.println("Enter the numbers");
            	first = scan.nextInt();
            	second = scan.nextInt();
    			System.out.println("The quotient of "+first+" and "+second+" is : "+divide(first,second));
    			break;
    		case 5:
    			System.out.println("Exiting Application.Thank You.");
    			System.exit(0);
    			break;
    		default:
    			System.out.println("Invalid option entered");
    			break;
    		}
        }
	}

	private static int divide(int first, int second) {
		// TODO Auto-generated method stub
		return (first/second);
	}

	private static int multiply(int first, int second) {
		// TODO Auto-generated method stub
		return (first*second);
	}

	private static int subtract(int first, int second) {
		// TODO Auto-generated method stub
		return (first-second);
	}

	private static int add(int first, int second) {
		// TODO Auto-generated method stub
		return (first+second);
	}

	private static int getChoice(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("Calculator");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit Application");
		System.out.println("Enter the choice");
		int choice = scan.nextInt();
		return choice;
	}

}