package com.curso.martes;

/*
 	La palabra reservada static es usada principalmente para la administración
 	de memoria.
 	Se puede tener :
 		- variables estaticas.
 		- metodo estaticos.
 		- bloques.
 		- clases
 	Si declaras una variable estatica puede ser usada para dos: 
 		Referir una propiedad en comun con todos los objetos
 		La variable estatica obtiene memoria solo una vez al
 		momento de ser cargada a la clase.
 	Ventajas:
 		Vuelve tu codigo mas eficiente (ahorras memoria).
 */
public class Student {
	int id;
	String name;
	static String Universidad = "ITC";
	
	Student(int i, String n) {
		id = i;
		name = n;
	}
	
	void display(){
		System.out.println(id + " " + name + " " + Universidad);
	}
	
	public static void main(String []args){
		Student s1 = new Student(1, "Fer");
		Student s2 = new Student(2, "Arantxa");
		s1.display();
		s2.display();
	}
}
