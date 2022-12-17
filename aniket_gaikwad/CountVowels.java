package com.String;

public class CountVowels {

	public static void main(String[] args) {
		String s = "JAVA IS A SIMPLEST PROGRAMMING LANGUAGE";
		char [] chars= s.toCharArray();
		int count = 0;
		for (char c : chars) {
			switch (c) {
			case'A':
			case'E':
			case'I':
			case'O':
			case'U':
				count++;
	        break;	
			}
		}
		System.out.println("Vowels Are = "+count);
}
}
