package com.curso.lunes.entidades;

import com.curso.lunes.pojo.Vehiculo;

public class Automovil extends Vehiculo {

	private boolean descapotable;
	private String tipo;
	public boolean isDescapotable() {
		return descapotable;
	}
	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
