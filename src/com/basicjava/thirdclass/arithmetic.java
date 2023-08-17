package com.basicjava.thirdclass;

public class arithmetic {
	
	
	public int addition(int num1,int num2) {
		System.out.println("The sum is :");
		int res = num1 + num2;
		return res;
		
	}
	
	public static int substraction() {
		
		int num11 = 193;
		int num22 = 29;
		
		return num11-num22;
		
	}
	
	
	public void mul(int num1,int num2) {
		
		int mulres = num1 * num2; 
		System.out.println("The multiplication of "+num1+","+num2 +"="+mulres);
	}

	
	public static void main(String[] args) {
		
		arithmetic obj = new arithmetic();
		obj.mul(5, 5);
		obj.substraction();
		obj.addition(12, 100);
		
		
		
	}
	
}
