package com.deloitte;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
        int fact = factorial(num);
        System.out.println("The factorial of "+num+" is : "+fact);
	}

	private static int factorial(int num) {
		// TODO Auto-generated method stub
		if(num == 0)
			return 1;
		else if(num==1)
			return 1;
		else
			return (num*factorial(num-1));
	}

}
