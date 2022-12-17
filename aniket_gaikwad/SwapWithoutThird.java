package com.swap;

public class SwapWithoutThird {

	public static void main(String[] args) {
		
		int x,y;
		   x = 40;  
	         y = 50;
	        System.out.println("Before swapping numbers: a="+x + " b="+ y);  
	   
	        x = x + y;   
	        y = x - y;   
	        x = x - y;   
	        System.out.println("After swapping:a="+x + " b=" + y);   
	}

}
