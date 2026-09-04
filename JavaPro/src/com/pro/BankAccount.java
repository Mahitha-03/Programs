package com.pro;

public class BankAccount {
	int accno;
	String holdername;
	double balance;
	static int accNoGen= 12000;
	{
		accNoGen++;
		accno = accNoGen;
	}

	public static void main(String[] args) {
		BankAccount a1 = new BankAccount();
		a1.holdername = "Mahitha";
		a1.balance = 200000;
		BankAccount a2 = new BankAccount();
		a2.holdername = "Mahi";
		a2.balance = 25000;
		System.out.println("Account no : " + a1.accno);
		System.out.println("holdername : " + a1.holdername);
		System.out.println("Balance : " + a1.balance);
		
		System.out.println("Account no : " + a2.accno);
		System.out.println("holdername : " + a2.holdername);
		System.out.println("Balance : " + a2.balance);
		
	}

}
