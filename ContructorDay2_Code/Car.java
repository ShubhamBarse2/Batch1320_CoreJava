package ContructorDay2_Code;

public class Car {

	int carNo;
	String carName;
	String clr;

	public Car(int carNo, String carName, String clr) {
		this.carNo = carNo;
		this.carName = carName;
		this.clr = clr;
	}

	public void display() {
		System.out.println("Car Info ... !");
		System.out.println(carNo + "  " + carName + "  " + clr);
	}

}
