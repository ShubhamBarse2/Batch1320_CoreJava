package MethodOverridingCode;

public class SbiBank extends RbiBank {

	@Override
	void interestRate() {
		System.out.println("SBI IR 7%");
	}

	void m1() {
		System.out.println("SBI M1 method");
	}

}
