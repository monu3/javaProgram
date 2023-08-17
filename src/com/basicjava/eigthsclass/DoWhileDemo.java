package com.basicjava.eigthsclass;

import java.util.Scanner;

public class DoWhileDemo {
	
	public static void main(String[] args) {
		
		int count =1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your table number:");
		int table = sc.nextInt();
		do {
			
			System.out.println(table+ " * " +count+ " = "+table*count);
			count = count +1;
		}while(count<=100);
		sc.close();
	}
}
