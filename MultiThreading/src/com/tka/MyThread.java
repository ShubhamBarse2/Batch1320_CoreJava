package com.tka;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
			}
			System.out.println(i);
		}
	}

	public void m1() {
		for (int i = 111; i <= 200; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
			}
			System.out.println(i);
		}

	}

}
