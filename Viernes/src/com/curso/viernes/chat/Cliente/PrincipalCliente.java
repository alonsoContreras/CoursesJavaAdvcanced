package com.curso.viernes.chat.Cliente;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;

public class PrincipalCliente extends JFrame {
	// Instancias Graficas
	public JTextField ingresoMensaje;
	public JTextArea pantallaChat;
	public JMenuItem adjuntar;

	private static Socket cliente;
	private static String ipServidor;// = "127.0.0.1";
	public static PrincipalCliente ventanaCliente;
	public static String usuario;

	// Creamos la ventana del chat del cliente
	public PrincipalCliente() {
		super("Chat");

		campoTexto();
		centrarChat();
		adjuntarArchivos();

	}

	public static void main(String[] args) throws IOException {
		ventanaCliente = new PrincipalCliente();
		// Coneccion con el cliente
		cliente = new Socket(ipServidor, 6666);
		ventanaCliente.mostrarMensaje("Buscando Servidor ...");

		// Correr los hilos de enviar y recibir
		HiloEnviar hiloEnviar = new HiloEnviar(ventanaCliente, cliente);
		hiloEnviar.start();
		HiloRecibir hiloRecibir = new HiloRecibir(ventanaCliente, cliente);
		hiloRecibir.start();

		// conectado a host
		ventanaCliente.mostrarMensaje("Conectado a :" + ipServidor);
		ventanaCliente.habilitar(true);

	}

	public void adjuntarArchivos() {
		// Crea opciones de Salir, Adjuntar Archivos y Aceptar Archivos
		JMenuItem salir = new JMenuItem("Salir");
		adjuntar = new JMenuItem("Adjuntar Archivo");
		adjuntar.setEnabled(false);
		JMenuBar barra = new JMenuBar();
		setJMenuBar(barra);
		barra.add(salir);
		barra.add(adjuntar);

		// Accion que se realiza Salir
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // Sale de la aplicacion
			}
		});

		// Accion que se realiza Adjuntar Archivo
		adjuntar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser ventanaEscojer = new JFileChooser();
				int seleccion = ventanaEscojer.showOpenDialog(ventanaEscojer);// Se
																				// abre
																				// el
																				// cuadro
																				// para
																				// escoger
																				// el
																				// archivo
				String path = ventanaEscojer.getSelectedFile()
						.getAbsolutePath();// Se obtiene la direccion completa
											// del archivo

				// bucle para realizar la comparacion del archivo y poderlo
				// enviar
				if (seleccion == JFileChooser.APPROVE_OPTION) {
					// JOptionPane.showMessageDialog(null, path);
//					ventanaCliente.mostrarMensaje("Enviando Archivo...");
//
//					ventanaCliente
//							.mostrarMensaje("Archivo Enviado Existosamente");
				}
			}
		});
		ipServidor = JOptionPane.showInputDialog(null,
				"Introduzca IP del servidor: ");
		setSize(320, 500);// tamano de la ventana del chat
		setVisible(true);// hace visible a la ventana
		usuario = JOptionPane.showInputDialog(null,
				"Introduzca nombre del servidor: ");
		setSize(320, 500);// tamano de la ventana del chat
		setVisible(true);// hace visible a la ventana
	}

	public void centrarChat() {
		// Hoja del chat centrado
		pantallaChat = new JTextArea();
		pantallaChat.setEditable(false);
		add(new JScrollPane(pantallaChat), BorderLayout.CENTER);
		pantallaChat.setBackground(Color.white);
		pantallaChat.setForeground(Color.black);
		ingresoMensaje.setForeground(Color.blue);
	}

	public void campoTexto() {
		// Campo de Texto en la parte inferior
		ingresoMensaje = new JTextField();
		ingresoMensaje.setEditable(false);
		add(ingresoMensaje, BorderLayout.SOUTH);

	}

	public void mostrarMensaje(String mensaje) {
		pantallaChat.append(mensaje + "\n");
	}

	public void habilitar(boolean editable) {
		ingresoMensaje.setEditable(editable);
		adjuntar.setEnabled(editable);
	}

}
