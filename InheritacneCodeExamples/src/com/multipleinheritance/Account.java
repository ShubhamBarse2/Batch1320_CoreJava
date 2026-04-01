package com.multipleinheritance;

public class Account {

	double balance;

	void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited : " + amount);
	}
}
