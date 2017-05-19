package com.curso.viernes.chat.Servidor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.SocketException;

public class HiloRecibir extends Thread {
	private final PrincipalServidor ventanaServidor;
	Socket s = null;
	@SuppressWarnings("unused")
	private ObjectInputStream entrada;
	private String mensaje;

	// Constructor del Hilo
	public HiloRecibir(PrincipalServidor ventanaServidor, Socket s)
			throws IOException {
		this.ventanaServidor = ventanaServidor;
		this.s = s;

		// ventanaServidor.ingresoMensaje.addActionListener(new ActionListener()
		// {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// mensaje = e.getActionCommand();
		// mostrarMensaje(mensaje);
		// ventanaServidor.ingresoMensaje.setText("");
		// }
		// });
	}

	public void mostrarMensaje(String mensaje) {
		ventanaServidor.pantallaChat.append(mensaje);
	}

	public void run() {
		try {
			entrada = new ObjectInputStream(this.s.getInputStream());
		} catch (IOException ex) {
			ventanaServidor.mostrarMensaje("Se perdio la conexio");
		}
		// DataInputStream dis;
		// try {
		// dis = new DataInputStream(this.s.getInputStream());
		// String str = (String) dis.readUTF();
		//
		// System.out.println("Mensaje: " + str);
		// ventanaServidor.mostrarMensaje(str);
		// this.s.close();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		do {
			try {
				mensaje = (String) entrada.readObject();
				ventanaServidor.mostrarMensaje(mensaje);
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
