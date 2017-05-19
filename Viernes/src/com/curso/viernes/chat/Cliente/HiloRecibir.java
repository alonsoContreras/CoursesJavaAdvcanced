package com.curso.viernes.chat.Cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.SocketException;

public class HiloRecibir extends Thread {
	private final PrincipalCliente ventanaCliente;
	private String mensaje;
	Socket s = null;
	@SuppressWarnings("unused")
	private ObjectInputStream entrada;

	// Constructor del Hilo
	public HiloRecibir(PrincipalCliente ventana, Socket s) {
		this.ventanaCliente = ventana;
		this.s = s;

	}

	// metodo para mostrar el mensaje
	public void mostrarMensaje(String mensaje) {
		ventanaCliente.pantallaChat.append(mensaje);
	}

	public void run() {
		try {
			entrada = new ObjectInputStream(this.s.getInputStream());
		} catch (IOException ex) {
			ventanaCliente.mostrarMensaje("Se perdio la conexio");
		}

		do {
			try {
				mensaje = (String) entrada.readObject();
				ventanaCliente.mostrarMensaje(mensaje);
			} catch (SocketException e) {
				e.printStackTrace();
				mensaje = "stop";
			} catch (EOFException ex) {
				ex.printStackTrace();
				mensaje = "stop";
			} catch (IOException exf) {
				exf.printStackTrace();
				mensaje = "stop";
			} catch (ClassNotFoundException exfs) {
				exfs.printStackTrace();
				mensaje = "stop";
			}
		} while (!mensaje.equals("stop"));

		try {
			entrada.close();
			this.s.close();
		} catch (IOException exf) {
			exf.printStackTrace();
		}
	}

}
