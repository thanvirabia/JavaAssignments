package com.deloitte;

public class Alternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=8,j=6;
        while((i<=13)&&(i>0)) {
        	System.out.print(i+" "+j+" ");
        	i++;
        	j--;
        }
        while(i<=13) {
        	System.out.print(i+" ");
        	i++;
        }
        while(j>0) {
        	System.out.print(j+" ");
        	j--;
        }
	}

}
