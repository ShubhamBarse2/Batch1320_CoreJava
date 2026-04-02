package MethodOverloadingCode;

public class MainClass {

	public static void main(String[] args) {
		A a = new A();
//		System.out.println(a.add(12, 12));
//		System.out.println(a.add(12, 12, 4));

//		a.add(12, 23456789876543l);
//		a.add(234587654l, 34);

		Amazon aa = new Amazon();
		aa.orderPlaced("Mobile Phone");
		aa.orderPlaced("Mobile Phone", 2);
		aa.orderPlaced("Mobile Phone", 4, 560000);
	}
}
