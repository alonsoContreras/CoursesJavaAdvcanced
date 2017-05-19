package com.curso.jueves;

public class TestJoinNombre extends Thread {

	@Override
	public void run(){
		System.out.println("corriendo...");
	}
	
	public static void main(String[] args) {
		TestJoinNombre t1 = new TestJoinNombre(),
				t2 = new TestJoinNombre(),
				t3 = new TestJoinNombre();
		
		System.out.println("El nombre del hilo 1 es: " + t1.getName());
		System.out.println("El nombre del hilo 2 es: " + t2.getName());
		System.out.println("El nombre del hilo 3 es: " + t3.getName());
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
		} catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
		t1.setName("Hilo A");
		t2.setName("Hilo B");
		t3.setName("Hilo C");
		
		System.out.println("Ahora el nombre del hilo 1 es: " + t1.getName());
		System.out.println("Ahora el nombre del hilo 2 es: " + t2.getName());
		System.out.println("Ahora el nombre del hilo 3 es: " + t3.getName());
	}
}
