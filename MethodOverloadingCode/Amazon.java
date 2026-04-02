package MethodOverloadingCode;

public class Amazon {

	void orderPlaced(String pName) {
		System.out.println("Product Name" + pName);
	}

	void orderPlaced(String pName, int Quantity) {
		System.out.println("Product Name -> " + pName + "  Quanitity -> " + Quantity);
	}

	void orderPlaced(String pName, int Quantity, double price) {
		System.out.println("Product Name -> " + pName + "  Quanitity -> " + Quantity + "  Price -> " + price);
	}

}
