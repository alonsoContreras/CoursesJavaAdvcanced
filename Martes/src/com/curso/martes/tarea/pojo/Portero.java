package com.curso.martes.tarea.pojo;

import com.curso.martes.tarea.interfaces.IPortero;

public class Portero implements IPortero {

	@Override
	public String detenerManos() {
		return "el portero detiene el balon con las manos";
	}

	@Override
	public String aventar() {
		return "el portero se lanza para tratar de detener el balon";
	}

	@Override
	public String mover() {
		return "el portero se prepara para poder detener el balon";
	}

	@Override
	public String quedarseParado() {
		return "el portero decide quedarse parado en el centro de la porteria";
	}

	@Override
	public String detenerPies() {
		return "el portero detiene el balon con el pie izquierdo, con mera rapidez e intuición";
	}

	public Portero() {
	}
}
