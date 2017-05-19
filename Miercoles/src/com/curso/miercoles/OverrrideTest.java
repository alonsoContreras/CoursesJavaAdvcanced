package com.curso.miercoles;

/*
  Si una subclase tiene el mismo metodo que se declaro en la clase
  padre, se conoce como redefinicion.
  
  Uso del override en java
  	Proporcionar implmentaciones especificas a metodos heredados.
  	Proporcionar los mecanismos que permiten el polimorfismo.
  Reglas para override
  	Mismo nombre que en la clase padre.
  	Mismo parametro que enla clase padre
  	Relaciones IS-A
 */
public class OverrrideTest {

	public static void main(String[] args) {
		Bike bici = new Bike();
		bici.run();
		
		Vehiculo v = new Bike();
		v.run();
	}
}

class Vehiculo {
	void run(){
		System.out.println("El vehiculo esta corriendo");
	}
}

class Bike extends Vehiculo  {
	void run() {
		System.out.println("La bicicleta esta corriendo");
	}
}