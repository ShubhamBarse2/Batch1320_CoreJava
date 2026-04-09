package com.tka;

public class Manager extends Employee2 {

	int empId;
	String name;

	public Manager() {
		super(36);
		System.out.println("this is contr of Manager class");
	}

	public void m2() {
		System.out.println("this is method of manager class m2"+super.name);
		super.info();
	}
}
