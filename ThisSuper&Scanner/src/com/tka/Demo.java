package com.tka;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur Full Name ");
		String name = sc.nextLine();

		System.out.println("Enter ur Age ");
		int age = sc.nextInt();

		sc.nextLine();
		System.out.println("Enter ur email ");
		String email = sc.nextLine();

		System.out.println("Enter ur MOB no ");
		long mobNo = sc.nextLong();

		System.out.println("Enter ur marks ");
		float marks = sc.nextFloat();

		System.out.println("Age is 18+  or not  ");
		boolean check = sc.nextBoolean();

		System.out.println("Enter special Symbol  ");
		String symbol = sc.next();

		System.out.println("--------------------------------");

		System.out.println(name);
		System.out.println(age);
		System.out.println(email);
		System.out.println(mobNo);
		System.out.println(check);
		System.out.println(marks);
		System.out.println(symbol);

	}
}
