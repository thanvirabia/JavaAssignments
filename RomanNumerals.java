package com.deloitte;

import java.util.Scanner;

public class RomanNumerals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt();
        int Copy = number;
        String roman = "";
        if((number<1)||(number>3000))
           System.out.println("Invalid Number");
        else {
        	while(number>0) {
        		if(number>=1000) {
        			roman+="M";
        			number-=1000;
        		}
        		else if(number>=900) {
        			roman+="CM";
        			number-=900;
        		}
        		else if(number >= 500) {
        			roman+="D";
        			number-=500;
        		}
        		else if(number>=400) {
        			roman+="CD";
        			number-=400;
        		}
        		else if(number >= 100) {
        			roman += "C";
        			number -= 100;
        		}
        		else if(number >=90) {
        			roman+="XC";
        			number-=90;
        		}
        		else if(number >= 50) {
        			roman+="L";
        			number-=50;
        		}
        		else if(number >= 40) {
        			roman += "XL";
        			number -= 40;
        		}
        		else if(number >=10) {
        			roman+="X";
        			number-=10;
        		}
        		else if(number>=9) {
        			roman+="IX";
        			number=number-9;
        		}
        		else if(number >= 5) {
        			roman+="V";
        			number-=5;
        		}
        		else if(number>=4) {
        			roman+="IV";
        			number-=4;
        		}
        		else {
        			roman+="I";
        			number-=1;
        		}
        	}
        	System.out.println("The roman numeral of "+Copy+" is : "+roman);
        }
	}

}
