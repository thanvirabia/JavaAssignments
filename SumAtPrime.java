package com.deloitte;

import java.util.Scanner;

public class SumAtPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("Enter the number of elements");
		num = scan.nextInt();
		int sum = 0;
        int [] array = new int[num];
        System.out.println("Enter elements of the array");
        for (int i = 0; i < num; i++) {
			array[i] = scan.nextInt();
		}
        for (int i = 0; i < num; i++) {
			if(isPrime(i))
				{
				sum += array[i];
				}
		}
        System.out.println("The sum of elements at prime indexes is : "+sum);
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
