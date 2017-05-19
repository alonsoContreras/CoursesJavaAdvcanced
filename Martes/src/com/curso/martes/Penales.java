package com.curso.martes;

import com.curso.martes.tarea.pojo.Delantero;
import com.curso.martes.tarea.pojo.Portero;

public class Penales {

	public static void main(String[] args) {
		new Juego().getJuego().mostrar();
	}

}

class Juego {
	public void mostrar() {
		Delantero d = new Delantero();
		Portero p = new Portero();
		
		System.out.println(d.preparar());
		System.out.println(p.mover());
		System.out.println(d.corre());
		System.out.println(d.patea());
		System.out.println(p.aventar());
		System.out.println(p.detenerPies());

		d = new Delantero("Javier");
		System.out.println(d.preparar());
		System.out.println(p.mover());
		System.out.println(d.corre());
		System.out.println(d.patea());
		System.out.println(p.aventar());
		System.out.println(p.detenerManos());

		d = new Delantero("Eduardo");
		System.out.println(d.preparar());
		System.out.println(p.mover());
		System.out.println(d.corre());
		System.out.println(d.tropezar());

		d = new Delantero("Benja");
		System.out.println(d.preparar());
		System.out.println(p.mover());
		System.out.println(d.corre());
		System.out.println(d.patea());
		System.out.println(p.quedarseParado());
		System.out.println(d.gol());
	}
	
	public Juego getJuego() {
		return new Juego();
	}
}