package com.jbk;

public class A {

	public void m1() {
		int a = 2;
		int b = 0;

		if (b == 0) {

			throw new OmkarException("/ 0 is NOT POSSIBLE in java");

		}

		System.out.println(a / b);
	}

}
