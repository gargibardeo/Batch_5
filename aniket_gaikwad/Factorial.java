package com.Factorial;

public class Factorial {

	public static void main(String[] args) {
		
		int a,fact=1 ;
		int b = 6;
		
	 for ( a=1;a<=b;a++) {
		fact = fact*a;
	}
     System.out.println("Factorial of " + b + " is " + fact);
	}

}