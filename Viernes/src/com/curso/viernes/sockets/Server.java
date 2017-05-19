package com.curso.viernes.sockets;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 Networking es un concepto de conectividad entre 2 o mas dispositivos juntos, que comparten recursos.

 La programación de socket proporcion la facilidad para compartir datos entre diferents dispositivos.

 Ventajas de NetWorking en Java
 Compartir recursos.
 Centralizar la gestion de software.

 Conceptos:
 Dirección IP: Numero dinamico asignado a un nodo de una red compuesto por octetos que van del 0 al 255
 Es una direción logica que puede ser cambiada

 Protocolo: Conjunto de reglas quese establecen paa la comunicacion. EJ: FTP, TCP, Telnet, SMTP, POP, etc..

 MAC(Media Access Control): Identificador unico de NIC(Networking Interface Controller). Un nodo de red puede
 tener multiples NIC, pero solo un MAC unico.
 Direccion fisica estatica.

 Protocolo Orientad a la Comunicacion
 Connection - Oriented.
 Es un protocolo de tipo TCP, tcp/ip, confiable pero lento. El acuse de recibo es enviado por el receptor.

 Connection - Less
 El receptor no envia el acuse de recibo.
 Es Rapido, sin embargo no es confiable, EJ UDP

 Socket: Punto final en una conexion Bidireccional.
 La programación de sockets se utiliza para la comunicacion entre las aplicaciones que se ejecutan entre
 diferentes aplicaciones JRE(Java Runtime Enviroment).

 La programación de socket puede ser orientada ha conexión o sin conexión.

 Las clases Java Socket y ServerSocket.
 Son usadas para la programación orientada a la comunicación.

 Las clases Java Socket y ServerSocket
 Connection Oriented

 Las clases DatagramSocket y DatagramPacket
 Connection Less

 El cliente del socket necesita saber:
 - IP Address del server.
 - Puerto.
 - Socket class.

 Socket class
 Metodos
 public InputStream getInputStream() - regresa el IS adjunto con el socket.
 public OutputStream getOutputStream() - regresa el OS adjunto al socket.
 public synchronized void close() - cerrar el socket.

 Server Socket
 Metodos
 public Socket accept() - establece la conexion entrante.
 public synchronized void close() - cierra la conexion
 */
public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(6666);
		Socket s = ss.accept();

		DataInputStream dis = new DataInputStream(s.getInputStream());

		String str = (String) dis.readUTF();

		System.out.println("Mensaje: " + str);
		
		ss.close();
	}
}
