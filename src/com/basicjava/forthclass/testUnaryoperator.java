package com.basicjava.forthclass;

import java.util.Scanner;

public class testUnaryoperator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num1 =sc.nextInt();
//		System.out.println("Num1 :"+num1);
//		int num2 = sc.nextInt();
//		System.out.println("Num2 :"+num2);
//		
//		int res1 = num1++;
//		int res2 = num1--;
//		int res3 = ++num1;
//		int res4 = --num1;
//		
//		System.out.println(res1);
//		System.out.println(res2);
//		System.out.println(res3);
//		System.out.println(res4);
		
		
//		int info = num1 & num2;
//		System.out.println(info);
//		int info2 = num1 | num2;
//		System.out.println(info2);
		
		
		
		int res = num1<<25;
		int res1 = num1>>25;
		System.out.println(res);
		System.out.print(res1);
		
		
		sc.close();

	}

}
