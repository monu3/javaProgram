package com.basicjava.seventhclass;

import java.util.Scanner;

public class ATMMachine {

	static double balance = 1000;
	
	public static void displayMenu(Scanner scanner) {
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check Balance");
		System.out.println("4. Exit");
		
		System.out.println("Enter your choice: ");
		int choice = scanner.nextInt();
		
		
		if(choice ==1)
		{
			depositAmount(scanner);
		}else if(choice == 2)
		{
			withdrawAmount(scanner);
		}else if(choice == 3)
		{
			checkbalance();
		}else if(choice == 4)
		{
			System.out.println("You are exiting from ATM!");
		}else 
		{
			System.out.println("Invalid operation!....");
		}
	}
	
	
	private static void checkbalance() {
		System.out.println("Total balance is : "+balance);
		
	}


	private static void withdrawAmount(Scanner scanner) {
		System.out.println("Enter the amount to withdraw: ");
		double withdraw = scanner.nextDouble();
		if(balance>500)
		{
			System.out.println("You can withdraw:");
			balance = balance - withdraw;
			System.out.println("Withdraw successful.....");
			System.out.println("THe withdraw amount is :"+withdraw);
			System.out.println("Remaining Balance : "+balance);
		}else
		{
			System.out.println("Not sufficient balance!....");
		}
		
		
	}


	private static void depositAmount(Scanner scanner) {
		System.out.println("Enter your amount: ");
		double depositAmount = scanner.nextDouble();
		balance = balance + depositAmount;
		System.out.println("The total amount in your account is : "+balance);
		
	}
	
	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your bank account no. : ");
//		double Acc_no = sc.nextDouble();
//		System.out.println("Okay!Do u want to deposit or withdraw: \n Write Y for deposit and W for withdraw");
//		char check = sc.nextLine().charAt(0);
//		
//		if(check =='Y') {
//			System.out.println("Enter your deposit: ");
//		}
//		//System.out.println("Enter your deposit: ");
//		
//		
		Scanner scanner = new Scanner(System.in);
		displayMenu(scanner);
		
		
	}
}
