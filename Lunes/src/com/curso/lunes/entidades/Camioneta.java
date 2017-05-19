package com.curso.lunes.entidades;

import com.curso.lunes.pojo.Vehiculo;

public class Camioneta extends Vehiculo {

	private String cabina;
	private String caja;	
	private String traccion;
	
	
	public String getCabina() {
		return cabina;
	}
	public void setCabina(String cabina) {
		this.cabina = cabina;
	}
	public String getCaja() {
		return caja;
	}
	public void setCaja(String caja) {
		this.caja = caja;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
}
