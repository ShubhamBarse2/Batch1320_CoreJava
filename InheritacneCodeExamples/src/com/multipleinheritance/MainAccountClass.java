package com.multipleinheritance;

public class MainAccountClass {

	public static void main(String[] args) {
		System.out.println("Saving Account ");
		SavingAccount sa = new SavingAccount();
		sa.deposit(34000);
		sa.showSaving();
		System.out.println("---------------------------------");
		CureentAccount ca = new CureentAccount();
		System.out.println("Current Account");
		ca.deposit(20000);
		ca.showCurrent();

	}

}
