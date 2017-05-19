package com.curso.lunes.pojo;

import com.curso.lunes.interfaz.IVehiculo;

public abstract class Vehiculo implements IVehiculo {

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("acelero");
	}

	@Override
    public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("apago");
	}

	@Override
	public boolean encender() {
		// TODO Auto-generated method stub
		System.out.println("encendio");
		return true;
	}

	@Override
	public void frenar() {
		// TODO Auto-generated method stub
		System.out.println("frenar");
	}

	private int asientos;
	private String bateria;
	private String color;
	private String llanta;
	private int manija;
	private String volante;
	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}

	public String getBateria() {
		return bateria;
	}

	public void setBateria(String bateria) {
		this.bateria = bateria;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLlanta() {
		return llanta;
	}

	public void setLlanta(String llanta) {
		this.llanta = llanta;
	}

	public int getManija() {
		return manija;
	}

	public void setManija(int manija) {
		this.manija = manija;
	}

	public String getVolante() {
		return volante;
	}

	public void setVolante(String volante) {
		this.volante = volante;
	}
	
}
