package com.multipleinheritance;

public class CureentAccount extends Account {

	double overdraftLimit = 10000;

	void showCurrent() {
		System.out.println("Balance : " + balance);
		System.out.println("OverDraft Limit : " + overdraftLimit);
	}

}
