package com.basicjava.seventhclass;

import java.util.Scanner;

public class switchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. of days u want:");
		int day = sc.nextInt();

		
		switch (day) 
		{
		case 1: 
			
			System.out.println("Sunday ");
			break;
		case 2:
			System.out.println("Monday ");
			break;
		case 3:
			System.out.println("Tuesday ");
			break;
		case 4:
			System.out.println("Wednesday ");
			break;
		case 5:
			System.out.println("Thusday ");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
			
	
		default:
			System.out.println("Invalid input...............");
		}
		
		
		sc.close();
	}
	
}
