package com.basicjava.forthclass;

import java.util.Scanner;

public class getinputfromuser {
	
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enetr the number:");
//		int num1 = scanner.nextInt();
//		
//		System.out.println("entered number is :"+num1);
//		scanner.close();
		
		
		System.out.println("Enter your Fname:");
		String name = scanner.nextLine();
		System.out.println("Enter your last name:");
		String lname = scanner.nextLine();
		System.out.println("Enter your Mname:");
		String mnam = scanner.nextLine();
		System.out.println("Enter your rollno:");
		int roll = scanner.nextInt();
		System.out.println("Enetr the age:");
		int Age = scanner.nextInt();
		System.out.println("Enter your gender:");
		scanner.nextLine();
		//String gender = scanner.nextLine();    //for string taking
		char gender = scanner.nextLine().charAt(0);  //for charater taking
		System.out.println("Enter your address:");
		String Add = scanner.nextLine();
		scanner.close();
		
		
		
		System.out.println(name);
		System.out.println(lname);
		System.out.println(mnam);
		System.out.println(roll);
		System.out.println(Age);
		System.out.println(gender);
		System.out.println(Add);
		
		
	}

}
