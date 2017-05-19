package com.curso.viernes.chat.Servidor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class HiloEnviar extends Thread {
	private final PrincipalServidor ventanaServidor;
	Socket s;
	private ObjectOutputStream salida;
	private String mensaje;

	public HiloEnviar(PrincipalServidor ventanaServidor, Socket s) {
		this.ventanaServidor = ventanaServidor;

		this.s = s;

		ventanaServidor.ingresoMensaje.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mensaje = e.getActionCommand();
				enviarMensaje(mensaje);
				ventanaServidor.ingresoMensaje.setText("");
			}
		});
	}

	@SuppressWarnings("unused")
	private void enviarMensaje(String mensaje) {
		try {
			salida.writeObject(ventanaServidor.usuario + " dice: " + mensaje);
			salida.flush();
			ventanaServidor.mostrarMensaje(ventanaServidor.usuario + " "
					+ mensaje);
		} catch (IOException e) {
			ventanaServidor.mostrarMensaje("Se perdio la conexio");
		}
	}

	// manipula areaPantalla en el hilo despachador de eventos
	public void mostrarMensaje(String mensaje) {
		ventanaServidor.pantallaChat.append(mensaje);
	}

	public void run() {
		try {
			salida = new ObjectOutputStream(this.s.getOutputStream());
		} catch (IOException ex) {
			ventanaServidor.mostrarMensaje("Se perdio la conexio");
		}
	}
}
