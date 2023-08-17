package com.basicjava.ninthclass;

import java.util.Scanner;

public class game {
	
	
	public static void main(String[] args) {
		
		int guess = 0;
		int luck = 69;
		
		do {
			System.out.println("Enter your desire number : ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if(num == luck)
			{
				System.out.println("You r lucky !");
				return;
			}else
			{
				System.out.println("Better luck next time buddy!");
				//int num = sc.nextInt();
			}
			guess ++;
			sc.close();
			
		}while( guess != 3 );
	}

}
