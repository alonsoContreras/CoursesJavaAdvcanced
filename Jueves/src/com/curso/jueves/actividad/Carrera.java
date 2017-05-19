package com.curso.jueves.actividad;

public class Carrera {

	public static void main(String[] args) {
		Tortuga t = new Tortuga();
		Thread t2 = new Thread(new Liebre());
		
		t.start();
		t2.start();
	}
}
