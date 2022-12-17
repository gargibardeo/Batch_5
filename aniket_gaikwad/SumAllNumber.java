package com.array;

public class SumAllNumber {

	public static void main(String[] args) {
		   
       
        int [] arr = new int [] {10,11,12,13,14,15};   
        
        int sum = 0;  
          
          for (int i = 0; i < arr.length; i++) {   
           sum = sum + arr[i];  
          }
          
        System.out.println("Sum of all the Number of an array: " + sum);  
	}
	
}
