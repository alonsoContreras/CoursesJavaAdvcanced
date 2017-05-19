package com.curso.viernes.chat.Cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class HiloEnviar extends Thread {

	private final PrincipalCliente ventanaCliente;
	private String mensaje;
	private ObjectOutputStream salida;
	Socket s;

	// Constructor
	public HiloEnviar(final PrincipalCliente ventana, Socket s) {

		this.ventanaCliente = ventana;
		this.s = s;

		// Evento que ocurre al escribir en el areaTexto
		ventanaCliente.ingresoMensaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				mensaje = event.getActionCommand();
				enviarMensaje(mensaje); // se envia el mensaje
				ventanaCliente.ingresoMensaje.setText(""); // el area donde se
															// ingresa el texto
															// se lo borra para
															// poder ingresar el
															// nuevo texto
			}
		});
	}

	// enviar objeto a cliente
	private void enviarMensaje(String mensaje) {

		try {
			salida.writeObject(ventanaCliente.usuario + " dice: " + mensaje);
			salida.flush();
			ventanaCliente.mostrarMensaje(ventanaCliente.usuario + " "
					+ mensaje);
		} catch (IOException e) {
			ventanaCliente.mostrarMensaje("Se perdio la conexio");
		}

	}

	// manipula areaPantalla en el hilo despachador de eventos
	public void mostrarMensaje(String mensaje) {
		ventanaCliente.pantallaChat.append(mensaje);
	}

	public void run() {
		try {
			salida = new ObjectOutputStream(this.s.getOutputStream());
		} catch (IOException ex) {
			ventanaCliente.mostrarMensaje("Se perdio la conexio");
		}
	}

}
