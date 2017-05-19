package com.curso.miercoles;

/*
 La palabra reservada Super es una variable de referencia al objeto inmediato
 de la clase padre.
 Siempre que se crea la instancia de la subclase, se crea una instancia de la
 superclase implicitamente a la que se refiere por super-variable.

 Uso de la palabra reservada super:
 super refiere a la variable de instancia del padre.
 super invoca al metodo de la clase padre.
 super invoca al constructor clase padre.
 */
public class Animal4 {
	String color = "Blanco";
}

class Dog4 extends Animal4 {
	String color = "Negro";

	void imprimir() {
		System.out.println(color);
		System.out.println(super.color);
	}
}

// super can be used to invoke parent class method
class Animal5 {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog5 extends Animal5 {
	void eat() {
		System.out.println("eating bread...");
	}

	void run() {
		System.out.println("running away...");
	}

	void takeShower() {
		System.out.println("taking a shower...");
	}

	void sample() {
		eat();
		run();
		takeShower();
		super.eat();
	}
}

class Animal6 {
	public Animal6() {
		System.out.println("Animal is created");
	}
}

class Dog6 extends Animal6 {
	public Dog6() {
		super();
		System.out.println("Dog is createrd");
	}
}

class PruebaAnimal {
	public static void main(String[] args) {
		Dog4 d = new Dog4();
		d.imprimir();

		Dog5 d2 = new Dog5();
		d2.sample();
		
		Dog6 d3 = new Dog6();
		
	}
}