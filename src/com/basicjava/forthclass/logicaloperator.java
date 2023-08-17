package com.basicjava.forthclass;

public class logicaloperator {
	
	public static void main(String[] args) {
		
		
		int num1 = 10;
		int num2 = 20;
		
		
		// logical AND (&&)
//		boolean result1 = num1>10 && num2>30;
//		System.out.println(result1);   //false
//		
//		boolean result2 = num1>=10 && num2<=30;
//		System.out.println(result2);   //true
//		
//		
//		boolean res = num1==10 && num2==20;
//		System.out.println(res);  //true
//		
//		
//		boolean res1 = num1<=9 && num2 >=19;
//		System.out.println(res1);  //false
//		
//		boolean res2 = num1==10 && num2>=15 && num1 >9 && num2 ==20;
//		System.out.println(res2); //true
		
		
		
		
		// Logical OR(||)
		
//		boolean result1 = num1>10 || num2>30;
//		System.out.println(result1);   //false
//		
//		boolean result2 = num1>=10 || num2<=30;
//		System.out.println(result2);   //true
//		
//		
//		boolean res = num1==10 || num2==20;
//		System.out.println(res);  //true
//		
//		
//		boolean res1 = num1<=9 || num2 >=19;
//		System.out.println(res1);  //true
//		
//		boolean res2 = num1==10 || num2>=15 || num1 >9 || num2 ==20;
//		System.out.println(res2); //true
		
		// Logical Not
		
		boolean result = !(num1 == num2);
		boolean result3 = (num1!=num2);
		System.out.println(result);
		System.out.println(result3);
		
		
		
		
	}

}
