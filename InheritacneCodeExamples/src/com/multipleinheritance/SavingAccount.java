package com.multipleinheritance;

public class SavingAccount extends Account {

	double interestRate = 5;

	void showSaving() {
		System.out.println("Balance " + balance);
		System.out.println("Interest : " + interestRate + "%");
	}

}
