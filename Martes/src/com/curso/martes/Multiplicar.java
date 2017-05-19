package com.curso.martes;

public class Multiplicar {

	int numero = 3;
	int multiplo = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplicar d = new Multiplicar();
		System.out.println("calculo: " + d.numero * d.multiplo);

		Multiplos m = new Multiplos();
		m.show("2");
		Multiplos m2 = new Multiplos();
		m2.loadVariables(5, 6);
		m2.show("tres");
		Multiplos m3 = new Multiplos(7, 8);
		m3.show("4");
	}

}

class Multiplos {
	int numero;
	int multiplo;

	public void loadVariables(int numero, int m) {
		this.numero = numero;
		multiplo = m;
	}

	public void show(String parte) {
		System.out.println("calculo parte " + parte + ": " + this.numero
				* this.multiplo);
	}

	public Multiplos() {
	}

	public Multiplos(int numero, int multiplo) {
		this.numero = numero;
		this.multiplo = multiplo;
	}
}