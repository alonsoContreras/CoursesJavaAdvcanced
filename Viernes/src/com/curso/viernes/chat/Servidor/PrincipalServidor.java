package com.curso.viernes.chat.Servidor;

import javax.swing.*;

import com.curso.viernes.chat.Archivos.EnviarArchivos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class PrincipalServidor extends JFrame {
	// Instancias Graficas
	public JTextField ingresoMensaje;
	public JTextArea pantallaChat;
	public JMenuItem adjuntar;
	public static String usuario;
	public static PrincipalServidor ventanaServidor;
	public static Socket servidor;
	private static ServerSocket serverSocket;
	private static String ipCliente;// = "10.0.0.4";

	// Constructor por Default
	public PrincipalServidor() {

		campoTexto();
		centrarChat();
		adjuntarArchivos();

	}

	public void campoTexto() {
		// Campo de Texto en la parte inferior
		ingresoMensaje = new JTextField();
		ingresoMensaje.setEditable(false);
		add(ingresoMensaje, BorderLayout.SOUTH);

	}

	// Hoja del chat centrado
	public void centrarChat() {
		pantallaChat = new JTextArea();
		pantallaChat.setEditable(false);
		add(new JScrollPane(pantallaChat), BorderLayout.CENTER);
		pantallaChat.setBackground(Color.white);
		pantallaChat.setForeground(Color.black);
		ingresoMensaje.setForeground(Color.blue);

	}

	// Crea opciones de Salir y Adjuntar Archivos
	public void adjuntarArchivos() {
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
					File file1 = new File(path);
					File file2 = new File("C:\\lunes");
					EnviarArchivos ea = new EnviarArchivos(file1, file2);
					ea.start();
				}
			}
		});
		ipCliente = JOptionPane.showInputDialog(null,
				"Introduzca numero IP del Cliente: ");
		setSize(320, 500);// tamano de la ventana del chat
		setVisible(true); // hace visible a la ventana

		usuario = JOptionPane.showInputDialog(null,
				"Introduzca nombre del Servidor: ");
		setSize(320, 500);// tamano de la ventana del chat
		setVisible(true); // hace visible a la ventana
	}

	private static void startThread() {
		// Correr los hilos de enviar y recibir
	}

	private static void connectCliente() throws IOException {
		// Conexion con el cliente

	}

	public void mostrarMensaje(String mensaje) {
		pantallaChat.append(mensaje + "\n");
	}

	public void habilitar(boolean editable) {
		ingresoMensaje.setEditable(editable);
		adjuntar.setEnabled(editable);
	}

	public static void main(String[] args) throws IOException {
		ventanaServidor = new PrincipalServidor();
		serverSocket = new ServerSocket(6666);
		ventanaServidor.mostrarMensaje("Buscando Cliente ...");
		servidor = serverSocket.accept();

		HiloEnviar hiloEnviar = new HiloEnviar(ventanaServidor, servidor);
		hiloEnviar.start();
		HiloRecibir hiloRecibir = new HiloRecibir(ventanaServidor, servidor);
		hiloRecibir.start();

		ventanaServidor.mostrarMensaje("Conectado a :" + ipCliente);
		ventanaServidor.habilitar(true);
	}
}