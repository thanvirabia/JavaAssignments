package com.deloitte;

import java.util.Scanner;

public class SumOfDigitsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int num = scan.nextInt();
        System.out.println("Enter the elements");
        int[] array = new int[num];
        int[] sumArray = new int[num];
        int copy;
        for(int i=0; i<num; i++) {
        	array[i]=scan.nextInt();
        }
        for(int i = 0; i<num; i++) {
            int sum=0;
        	copy = array[i];
        	while(copy>0) {
        		sum += (copy%10);
        		copy = copy/10;
        	}
        	sumArray[i] = sum;
        }
        System.out.println("The sum array is :");
        for(int i=0; i<num; i++) {
        	System.out.print(sumArray[i]+" ");
        }
        
	}

}
