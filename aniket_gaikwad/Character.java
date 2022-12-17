package com.String;

public class Character {

	public static void main(String[] args) {
		
		String string = " Aniket Gaikwad ";  
        int count = 0;  
          
        for(int i = 0; i < string.length(); i++) {  
            if(string.charAt(i) != ' ')  
                count++;  
        }  
         
        System.out.println("Total Character is: " + count); 

	}

}
