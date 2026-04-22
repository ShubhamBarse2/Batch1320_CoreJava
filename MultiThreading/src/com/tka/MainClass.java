package com.tka;

public class MainClass {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start(); // it is used to start the thread logic
		t.m1();
	}

}
