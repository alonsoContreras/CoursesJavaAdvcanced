package com.curso.miercoles;

/*
Una interfaz es un plano de una clase.
Tiene constantes estaticas y metodos abstractos.
Es un mecanismo que permite la abstracción
Solo puede contener metodso abstractos.
Permite la herencia multiple.
No se puede instanciar como una clase abstracta.

Razones para usar una interface
	Podemos apoyar la funcionalidad de herencia multiple.
	Se utiliza para lograr el desacoplamiento.
	
Java 8: Puede contener metodos predeterminados estaticos.
*/
interface show {
	void print();
}

public class InterfaceTest implements show {

	@Override
	public void print() {
		System.out.println("Hola");
	}

	public static void main(String[] args) {
		InterfaceTest a = new InterfaceTest();
		a.print();
	}
}
