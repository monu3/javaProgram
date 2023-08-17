package com.basicjava.ninthclass;

import java.util.Scanner;

public class swap {
	
	public static void main(String[] args) {
		
		
		String temp;
		String name = "Monu";
		String surname = "Siddiki";
		
		System.out.println("Befor swap  :"  + "Name:   "+name+"Surname   "+surname);
		temp = name;
		name = surname;
		surname = temp;
		
		System.out.println("After swap:    " +  "Name  "  +name+"Surname   "+surname);
		
		
		int a = 5;
		int b = 6;
		System.out.println("Before swap :   "+"A ="+a+"B ="+b); 
		 a = a+b;
		 b= a-b;
		 a = a-b;
		
		 System.out.println("After swap:  "+"A = "+a+"B =   "+b);
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		int num = sc.nextInt();
		int reverse = 0;
		while(num!=0) {
			int rev = num%10;
			reverse = reverse*10+rev;
			System.out.println("reverse: "+rev);
			num = num/10;
			
		}
		System.out.println("THe reverse number is :  "+reverse);
		
}
}