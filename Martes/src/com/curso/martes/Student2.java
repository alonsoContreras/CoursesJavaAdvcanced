package com.curso.martes;

/*
 Si se aplica la palabra reservada static a cualquier metodo,
 se conoce como un metodo estatico.

 Un metodo estatico solo pertenece a la clase en lugar
 de objeto de una clase.

 Se puede invocar un metodo estatico sin necesidad de crear
 una instancia a una clase

 El metodo estatico puede acceder al miembro de datos
 estaticos y puede cambiar el valor del mismo.
 */
public class Student2 {
	int noControl;
	String name;
	static String Instituto = "ITL";

	public static void change() {
		Instituto = "ITC";
	}

	public Student2() {

	}

	public Student2(int nc, String n) {
		noControl = nc;
		name = n;
	}

	public void display() {
		System.out.println(noControl + " " + name + " " + Instituto);
	}

	public static void main(String[] args) {
		Student2.change();

		Student2 s1 = new Student2(1, "Fer");
		Student2 s2 = new Student2(2, "Flor");
		Student2 s3 = new Student2(3, "Ferro");

		s1.display();
		s2.display();
		s3.display();
	}
}
