package com.curso.lunes;

import com.curso.lunes.entidades.Automovil;

public class VehiculoPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automovil automovil = new Automovil();
		automovil.setAsientos(2);
		automovil.setBateria("LTH");
		automovil.setColor("blanco");
		automovil.setDescapotable(false);
		automovil.setLlanta("Uniroyal R14");
		automovil.setManija(4);
		automovil.setTipo("sedan");
		automovil.setVolante("clasico");
		if (automovil.encender()) {
			automovil.acelerar();
			automovil.frenar();
			automovil.apagar();
		}
		else
			System.out.println("El automovil cuenta con fallas");
	}
}
