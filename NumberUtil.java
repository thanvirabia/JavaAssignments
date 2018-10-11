package com.deloitte;

import java.util.Scanner;

public class NumberUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int choice,num1,num2;
        double num3;
        while(true) {
        	choice = getChoice(scan);
        	switch (choice) {
			case 1:
				System.out.println("Enter the two numbers");
				num1 = scan.nextInt();
				num2 = scan.nextInt();
				int prod = product(num1,num2);
				break;
			case 2:
				System.out.println("Enter the number");
				num3 = scan.nextDouble();
				double sqrt = squareroot(num3);
				break;
			case 3:
				System.out.println("Exiting Application.Thank You.");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Option entered.");
				break;
			}
        }
	}

	private static double squareroot(double num3) {
		// TODO Auto-generated method stub
		double sqrt = Math.sqrt(num3);
		System.out.println("The square root of "+num3+" is : "+sqrt);
		return sqrt;
	}

	private static int product(int num1, int num2) {
		// TODO Auto-generated method stub
		int prod = num1*num2;
		System.out.println("The product of "+num1+" and "+num2+" is : "+prod);
		return prod;
	}

	private static int getChoice(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("1. Product of 2 numbers");
		System.out.println("2. Square root of a number");
		System.out.println("3. Exit Application");
		int choice = scan.nextInt();
		return choice;
	}

}
