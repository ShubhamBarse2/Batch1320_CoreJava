package com.jbk;

import com.tka.Demo;

public class A extends Demo {

	protected A(int a) {
		super(23);
	}

	protected void m2() {
		System.out.println("this is m2 of child");
		super.m1();
	}

	public static void main(String[] args) {
		A a = new A(23);
		a.m1();

	}

}
