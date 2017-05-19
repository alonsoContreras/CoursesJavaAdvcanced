package com.curso.jueves.actividad;

public class Liebre implements Runnable{

	@Override
	public void run() {
		int i = 0;
		System.out.println("Inicia la liebre");
		while (i<5) {
			try {
				Thread.sleep(2000);
				System.out.println("la liebre da un paso");
			}catch (InterruptedException ex) {
				System.out.println(ex);
			}
			i++;
		}
		System.out.println("Termina la liebre");
	}

}
