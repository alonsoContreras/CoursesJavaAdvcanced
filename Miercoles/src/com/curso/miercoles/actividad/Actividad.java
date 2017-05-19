package com.curso.miercoles.actividad;

public class Actividad {
	public static void main(String[] args) {
		Banco b1 = new BanCoppel();
		System.out.println("resultado BanCoppel: " + b1.rangoInteres(100));

		Banco b2 = new Bancomer();
		System.out.println("resultado Bancomer: " + b2.rangoInteres(100));

		Banco b3 = new Hsbc();
		System.out.println("resultado Hsbc: " + b3.rangoInteres(100));
	}
}

class Banco {
	public float rangoInteres(float importe) {
		return importe;
	}
}

class BanCoppel extends Banco {
	float interes = 7f;

	public float rangoInteres(float importe) {
		float interesCal = (importe / 100 * interes);
		return importe - interesCal;
	}
}

class Bancomer extends Banco {
	float interes = 9f;

	public float rangoInteres(float importe) {
		float interesCal = (importe / 100 * interes);
		return importe - interesCal;
	}
}

class Hsbc extends Banco {
	float interes = 8f;

	public float rangoInteres(float importe) {
		float interesCal = (importe / 100 * interes);
		return importe - interesCal;
	}
}