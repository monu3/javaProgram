package com.basicjava.fifthclass;

import java.util.Scanner;

public class relationalOperator {
	
	
	
	public static void Equal(int num1,int num2) {
		
		boolean res = num1 == num2;
		System.out.println("Result :"+res);
		
	}
	public static void NotEqual(int num1,int num2) {
		
		boolean res = num1 != num2;
		System.out.println("Result1 :"+res);
		
	}
	public static void Greater(int num1,int num2) {
		
		boolean res = num1 > num2;
		System.out.println("Result2 :"+res);
		
	}
	public static void lesser(int num1,int num2) {
		
		boolean res = num1< num2;
		System.out.println("Result3 :"+res);
		
	}
	public static void Greaterthequal (int num1,int num2) {
		
		boolean res = num1 >= num2;
		System.out.println("Result4 :"+res);
		
	}
	
	public static void lesserthEqual(int num1,int num2) {
		
		boolean res = num1 <= num2;
		System.out.println("Result5 :"+res);
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		int num2 = sc.nextInt();
		
		Equal(num1,num2);
		NotEqual(num1,num2);
		Greater(num1,num2);
		lesser(num1,num2);
		Greaterthequal(num1,num2);
		lesserthEqual(num1,num2);
		
		
		
		
	}

}
