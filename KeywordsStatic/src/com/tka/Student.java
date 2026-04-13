package com.tka;

public class Student extends Demo {
	
	
	public static void m2() {
		System.out.println("0987654321");
	}

	public Student() {
		super();

	}

	{
		System.out.println("this is non static block of Student");
	}
	static {
		System.out.println("this is static block of Student");
	}

	public static void main(String[] args) {
		Demo d = new Student();
		

//		System.out.println(Demo.clgName);
	}
}
