package com.tka;

public class B {

	public void m2() throws Exception {
		A a = new A();
		try {
			a.m1();
		} catch (Exception e) {
			System.out.println("this is Not Allowed in java");
		}

	}
}
