package com.deloitte;

public class PrimeSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Square of prime numbers :");
        int number = 0;
        int square = 0;
        while(square<=900){
        	if(isPrime(number)) {
        		square = number*number;
        		if(square<=900)
        			System.out.println(square+" ");
        		
         	}
        	number++;
        }
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
