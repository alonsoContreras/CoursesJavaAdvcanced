package com.curso.martes;

/*
 This
 Se trata de una variable referencia al objeto actual

 Usos de la palabra reservada this:
 - Puede ser usado para referir a la instancia de la
 clase actual.
 - Se utiliza para invocar el metodo de la clase actual
 (implicitamente).
 - Se utiliza para invocar el constructor de la clase
 actual.
 - Se puede pasar como un argumento en la llamada al
 metodo.
 - Puede ser pasado como argumento en la llamada al
 constructor.
 Se puede utilizar para devolver la instancia actual
 del metodo.
 */
public class StudentT {
	StudentT obj;

	public StudentT() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.returnStudent());
	}
}

class Test {
	Test obj;

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public Test returnStudent() {
		return this.obj;
	}
}
