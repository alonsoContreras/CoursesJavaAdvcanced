package com.curso.martes;

/*
 Constructor 	                   | 					Metodo
 Se usa para inicilizar un objeto.	Es usado para explicar el comportamiento de objeto. 
 No tiene un tipo de retorno.		Tiene un valor de retorno.
 Es invocado implicitamente.		Es invocado explicitamente.
 El compilador de java provee un	No lo provee ni el compilador ni la clase.
 constructor por default si no		Puede o no tener la misma signatura de la clase que
 tiene uno.							lo contiene.
 Debe contener la misma signatura.
 */
public class Integrante {
	int id;
	String nombre;

	public Integrante(int i, String n) {
		id = i;
		nombre = n;
	}
	
	public Integrante(Integrante in) {
		id = in.id;
		nombre = in.nombre;
	}
	
	public void display() {
		System.out.println(id + " " + nombre);
	}
	
	public Integrante(){
	}
	
	public static void main (String[] args) {
		Integrante i1 = new Integrante(1, "Fer");
		Integrante i2 = new Integrante(i1);
		i1.display();
		i2.display();
	}
}
