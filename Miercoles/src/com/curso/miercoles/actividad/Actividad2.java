package com.curso.miercoles.actividad;

public class Actividad2 {
	public static void main(String[] args) {
		Banco2 b1 = new BanCoppel2();
		System.out.println("resultado BanCoppel: " + b1.rangoInteres(100));

		b1 = new Bancomer2();
		System.out.println("resultado Bancomer: " + b1.rangoInteres(100));

		b1 = new Hsbc2();
		System.out.println("resultado Hsbc: " + b1.rangoInteres(100));
	}
}

abstract class Banco2 {
	abstract float rangoInteres(float importe);
}

class BanCoppel2 extends Banco2 {
	float interes = 7f;

	@Override
	float rangoInteres(float importe) {
		float interesCal = (importe / 100 * interes);
		return importe - interesCal;
	}
}

class Bancomer2 extends Banco2 {
	float interes = 9f;

	@Override
	float rangoInteres(float importe) {
		float interesCal = (importe / 100 * interes);
		return importe - interesCal;
	}
}

class Hsbc2 extends Banco2 {
	float interes = 8f;

	@Override
	public float rangoInteres(float importe) {
		float interesCal = (importe / 100 * interes);
		return importe - interesCal;
	}
}
