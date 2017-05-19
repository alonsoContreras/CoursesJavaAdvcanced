package com.curso.jueves;

public class TestSleep extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException ex) {
				System.out.println(ex);
			}
		}
	}

	public static void main(String[] args) {
		TestSleep t = new TestSleep(), t2 = new TestSleep();
		
		t.start();
		t2.start();
	}
}
