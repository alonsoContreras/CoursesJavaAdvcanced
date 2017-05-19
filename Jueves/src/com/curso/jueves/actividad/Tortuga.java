package com.curso.jueves.actividad;

public class Tortuga extends Thread {

	@Override
	public void run() {
		int i = 0;
		System.out.println("inicia la tortuga");
		
		while (i<=5) {
			try {
				Thread.sleep(5000);
				System.out.println("Doy un paso");
			} catch(InterruptedException ex) {
				System.out.println(ex);
			}
			i++;
		}
		
		System.out.println("Ya llego la tortuga");
	}
}
