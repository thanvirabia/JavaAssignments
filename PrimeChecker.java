package com.deloitte;

import java.util.Scanner;

public class PrimeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
        boolean prime = isPrime(num);
        System.out.println("The entered number "+num+" is prime : "+prime);
	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		int check = 1;
		for(int i=2;i<num;i++) {
			if(num%i==0)
				check = 0;
		}
		if(num==0)
			return false;
		if(num==1)
			return false;
		if(check==1)
			return true;
		else 
			return false;
	}

}
