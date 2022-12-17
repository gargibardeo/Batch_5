package com.Factorial;

import java.util.Scanner;

public class FactorialReturn {

	public static void main(String[] args) {
		
		FactorialReturn d = new FactorialReturn ();
		int methodFactorialRT = d.methodFactorialRT ();
		System.out.println("Factorial is " + methodFactorialRT);
	}
	public int methodFactorialRT() {
		
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter The Number =");
	int b = sc.nextInt();
	
	int a,fact=1 ;
	
    for ( a=1;a<=b;a++) {
	fact = fact*a;
	
}

    return fact;
}
}