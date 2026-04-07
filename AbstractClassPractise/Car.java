package AbstractClassPractise;

public abstract class Car implements Vehicle {

	public Car() {
		System.out.println(" this is contr of abstract class Car");
	}

	@Override
	public void m1() {
		System.out.println("this is m1 of Vehicle Interface ");

	}

	public abstract void m2();

}
