package com.curso.martes;

/*
 Objeto: Entidad del mundo real que posee tres caracteristicas: comportamiento, estado e identidad.
 Estado: Representa el valor de un valor.
 Comportamiento: Representa la funcionalidad que posee el objeto.
 Identidad: Un objeto es tipicamente implementado con un I. El valor del ID no es visible para el usuario final, pero
 es usado internamente por la JVM, para identificar cada objeto de manera unica.
 
 Un objeto es una instancia de una clase.
 
 CLASE: es un grupo de objetos que tiene propiedades comunes. Es una plantilla para modelar los objeetos que se crean.
 Una clase contiene: campos, metodos, constructores, bloques, clases anidades e interfaces.
 * */
public class Estudiante {

	int id; // campo o dato o una instancia
	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");
		//Creando un objeto de estudiante
		Estudiante estudiante = new Estudiante();
		//accesando al objeto al que hace referencia
		System.out.println(estudiante.id);
		System.out.println(estudiante.name);
		
		Alumno alumno = new Alumno();
		System.out.println(alumno.id);
		System.out.println(alumno.name);
		
		alumno.inicializarVariables(001, "mostrar");
		alumno.mostrar();
		
		Alumno a = new Alumno(1, "fer");
		a.mostrar();
	}
}

class Alumno {
	// Inicializacion por referencia.
	int id;
	String name;
	// Inicializacion por metodo.
	public void inicializarVariables(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void mostrar(){
		System.out.println(id + " " + name);
	}
	
	public Alumno(){}
	// Inicializacion por Constructor.
	public Alumno(int id, String name) {
		this.id = id;
		this.name = name;
	}
}