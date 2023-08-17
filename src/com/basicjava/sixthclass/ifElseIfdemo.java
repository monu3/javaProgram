package com.basicjava.sixthclass;

public class ifElseIfdemo {
	
	public static void main(String[] args) {
		
		
		int data = 230;
		
		if (data >230)
		{
			System.out.println("inside the if block");
			System.out.println(data+"is greater");
		}else if(data>231)
		{
			System.out.println("inside the 2 else if block");
			System.out.println(data+"is greater");
		}
		else if(data>229)
		{
			System.out.println("inside the 3 else if block");
			System.out.println(data+" is greater");
		}
		else
		{
			System.out.println("inside the else block");
			System.out.println("All the above is fail");
		}
	}

}
