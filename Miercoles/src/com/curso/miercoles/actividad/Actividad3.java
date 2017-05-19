package com.curso.miercoles.actividad;

/*
 Abstract
 	Tiene metodos abstractos y no abstractos.
 	Usa la palabra reservada abstract.
 	Puede proveer la implementación de una interface.
 	No soporta la herencia multiple.
 	Puede tener variables estaticas, finales, no finales y no
 	estaticas.
 Interface
 	Solo puede contener metodos abstractos.
 	En java8 tiene metodos default y estaticos.
 	Soporta la herencia multiple.
 	Solos tiene variables y finales
 	No puede proveer la implementación de una clasee abstracta.
 	Usa la palabra reversada inerface
 */
public class Actividad3 {
	public static void main(String[] args) {
		Banco3 b1 = new BanCoppel3();
		System.out.println("resultado BanCoppel: " + b1.rangoInteres(100));

		b1 = new Bancomer3();
		System.out.println("resultado Bancomer: " + b1.rangoInteres(100));

		b1 = new Hsbc3();
		System.out.println("resultado Hsbc: " + b1.rangoInteres(100));
	}
}

interface Banco3 {
	abstract float rangoInteres(float importe);
}

class BanCoppel3 implements Banco3 {
	float interes = 7f;

	@Override
	public	float rangoInteres(float importe) {
		float interesCal = (importe / 100 * interes);
		return importe - interesCal;
	}
}

class Bancomer3 implements Banco3 {
	float interes = 9f;

	@Override
	public float rangoInteres(float importe) {
		float interesCal = (importe / 100 * interes);
		return importe - interesCal;
	}
}

class Hsbc3 implements Banco3 {
	float interes = 8f;

	@Override
	public float rangoInteres(float importe) {
		float interesCal = (importe / 100 * interes);
		return importe - interesCal;
	}
}
