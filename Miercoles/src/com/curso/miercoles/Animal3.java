package com.curso.miercoles;

//Herencia Jerarquica
public class Animal3 {

	void eat() {
		System.out.println("Comiendo...");
	}	
}

class Perro extends Animal3 {
	void run() {
		System.out.println("Corriendo..");
	}
}

class Cat extends Animal3 {
	void meow(){
		System.out.println("Meowing...");
	}
}


class HerenciaJerarquica {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.meow();
		c.eat();
	}
}
