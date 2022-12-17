package com.String;

public class Reverse {
	static String reverse(String str){  
	    StringBuilder ab = new StringBuilder(str);  
	    ab.reverse();  
	    return ab.toString(); }
	public static void main(String[] args) {
		
		  System.out.println(Reverse.reverse("Aniket"));  
		  
         
	}

}
