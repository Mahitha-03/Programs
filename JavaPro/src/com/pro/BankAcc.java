package com.pro;

import java.util.Scanner;

public class BankAcc {
	static int balance = 1000;
	 void deposit(int amount)
	 {
		 balance = balance + amount;
		 System.out.println("total balance after deposit :" + balance);
	 }
	 void withdraw(int amount)
	 {
		 balance = balance - amount;
		 System.out.println("total balance after withdraw :" + balance);
		 
	 }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the deposit amount:");
		int deposit_amount = sc.nextInt();
		System.out.println("enter the withdraw amount:");
		int withdraw_amount = sc.nextInt();

		
		BankAcc a1 = new BankAcc();
		a1.deposit(deposit_amount);
		a1.withdraw(withdraw_amount);
		
		
		
	}

}
