package com.curso.miercoles;

/*
 Una clase que se declara abstract no se conoce como clase abstracta. Tiene que heredarse
 y sus metodos debe ser implementados. No puede instanciarse.
 
 Un metodo se declara abstrat cuando no tiene implementacion y tiene la palabra reservada abstract.
 */
public class AbstractTest extends Bike2 {

	@Override
	void run() {
		System.out.println("corriendo..");
	}
	
	public static void main(String[] args) {
		Bike2 n = new AbstractTest();
		n.run();
	}
	
}

abstract class Bike2 {
	abstract void run();
}
