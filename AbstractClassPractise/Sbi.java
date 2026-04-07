package AbstractClassPractise;

public class Sbi extends Bank {

	public Sbi() {
		System.out.println("this is Constr of Sbi ");
	}

	@Override
	public void interestRate() {
		System.out.println("SBI Bank IR 7%");

	}

}
