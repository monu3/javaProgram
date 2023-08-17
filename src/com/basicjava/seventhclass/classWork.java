package com.basicjava.seventhclass;

import java.util.Scanner;

public class classWork {

	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your charater:");
		String let = sc.nextLine();
		char ForCase = let.charAt(0);
		char letter = let.toLowerCase().charAt(0);
		
		
		if (letter=='a' || letter =='e' || letter == 'i' || letter=='o'  || letter == 'u' )
		{
			System.out.println("The input is a voweal letter :"+letter);
		}
		else
		{
			System.out.println("It is consonent :"+letter);
		}
		
		if( ForCase>='A' && ForCase <='Z' ) {
			System.out.println("It is uppercase");
			
		}
		else
		{
			System.out.println("it is lower");
		}
		sc.close();
	}
}
