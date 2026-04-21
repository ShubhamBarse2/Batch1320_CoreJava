package com.tka;

public class A {

	public void m1() throws ClassNotFoundException, ArithmeticException {
		Class.forName("");
		System.out.println(3 / 0);
	}

}
