package com.basic;

import java.util.Scanner;
public class Evenodd {

	public static void main(String[] args) {
	    Scanner Sc = new Scanner (System.in);
	    System.out.println("Enter the number");
	    int a = Sc.nextInt();
	    int rem = a%2;
	    
	    if(rem==0)  {
	    	System.out.println("The number is even");
	    	
	    }
	    else
	    	System.out.println("The number is odd");
	
	
	

	}

}
