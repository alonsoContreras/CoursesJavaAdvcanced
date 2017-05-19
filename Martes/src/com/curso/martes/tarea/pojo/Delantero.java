package com.curso.martes.tarea.pojo;

import com.curso.martes.tarea.interfaces.IDelantero;

public class Delantero implements IDelantero {

	private String nombreJugador = "Jose";

	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public Delantero() {
	}

	public Delantero(String nombre) {
		nombreJugador = nombre;
	}

	@Override
	public String patea() {
		return this.nombreJugador + " patea el balon con dirección a gol";
	}

	@Override
	public String preparar() {
		return this.nombreJugador + " toma el balon, lo planta en el punto penal, da unos pasos hacia atras y se prepara para patearlo";
	}

	@Override
	public String corre() {
		return this.nombreJugador + " corre hacia el balon, esta dispuesto a anotar un gol";
	}

	@Override
	public String tropezar() {
		return this.nombreJugador + " por su impetu de anotar, se hace bolas con sus pies y se tropieza";
	}

	@Override
	public String gol() {
		return this.nombreJugador + " anota el gol que da vida a su equipo, en punto de clasificar a la liguilla";
	}
}
