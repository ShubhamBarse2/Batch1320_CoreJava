package com.multipleinheritance;

public class Main {

	public static void main(String[] args) {
		Gmail mail = new Gmail();
		mail.accessibity();
		mail.sentMail();

		GoogleLocation location = new GoogleLocation();
		location.accessibity();
		location.myLocation();

		Drive d = new Drive();
		d.accessibity();
		d.saveInfo();
	}
}
