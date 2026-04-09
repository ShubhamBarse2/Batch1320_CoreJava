package com.tka;

import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur Employee Id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter ur Name");
		String name = sc.nextLine();
		System.out.println("Enter ur City");
		String city = sc.nextLine();
		System.out.println("Enter ur Salary");
		double salary = sc.nextDouble();

		Employee e = new Employee(id, name, city, salary);
		System.out.println(e);
		sc.close();

	}
}
