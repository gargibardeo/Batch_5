package com.String;

public class RemoveSpace {
  
	public static void main (String []args) {
		
		String s="Aniket Sunil Gikwad";  
        
           s = s.replaceAll("\\s+", "");  
          
        System.out.println("String After Removing Spaces : " + s); 
	}
}
