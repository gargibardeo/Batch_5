package com.oops;

public class exception {
   public static void main(String []args) {
	//  1 
	  try {
		   int a = 10;
		   int b = a%0;
		   System.out.println(b);
	   }
	   catch ( Exception e) {
		   System.out.println(e.getMessage());
		   System.out.println("Hello");
	 } 
	  // 2
	   try {
	    
		String s = null;
	    System.out.println(s.length());
	   }
	   catch (Exception e) {
		   System.out.println(e.getMessage());
	   }
	   // 3
	   try {
		   int a[] = new int[10];
				   System.out.println(a[15]);
	   }
	   catch (Exception e) {
		   System.out.println(e.getMessage());
	   }
   }   
}
