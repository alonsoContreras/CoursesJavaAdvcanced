package com.curso.miercoles;

public class Persona {

	int id;
	String name;

	public Persona(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Empleado extends Persona{
	float salario;
	public Empleado(int id, String name, float salario) {
		super(id, name);
		this.salario = salario;
	}
	
	void display() {
		System.out.println(id + " " + name + " " + salario);
	}
}

class PersonaTest {
	public static void main(String[] args) {
		Empleado e = new Empleado(1, "Fer", 12500);
		e.display();
	}
}