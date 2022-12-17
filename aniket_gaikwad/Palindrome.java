package com.Palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		int n,s=0,a,r;
		
		Scanner sc = new Scanner (System.in);
	    System.out.println("Enter Number =");
	    n = sc.nextInt();
	    a = n;
	
	    do
	    { 
	        r=n%10;
	        s=s*10+r;
	        n=n/10;
	       
	    }while(n>0);
	    	
	    if(a==s)
	    {
	   System.out.println(a+" is a palindrome number ");
	  
	    }
	    else
	    {
	        System.out.println(a+" is not a palindrome number");
	    } 
		  }        
		
	}
