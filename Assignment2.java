package com.deloitte;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=50;i++) {
        	if(i%15 == 0)
        		System.out.print("abcxyz ");
        	else if(i%3==0)
        		System.out.print("abc ");
        	else if(i%5==0)
        		System.out.print("xyz ");
        	else
        		System.out.print(i+" ");
        }
	}

}