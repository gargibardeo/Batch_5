package com.Ifelseprogram;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		int temp = no;
		int rev = 0, rem;
		while (temp != 0)
		{
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (no == rev) {
			System.out.println(" palindrome number");
		} 
		else {
			System.out.println(" not palindrome number");
		}
	}
}
