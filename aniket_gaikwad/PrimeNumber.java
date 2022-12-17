package com.Prime;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number : ");
		
		int b,i;
	
		i = sc.nextInt();
		
			b = 0;
			
			for (int c =2; c <= i/2; c++) {
				if (i%c==0) {
				b++;
				break;
				}
			}
			if (b == 0){
				System.out.println("Prime Number");
			}
			else {
			System.out.println("Not A Prime Number");
		}

			}
}



