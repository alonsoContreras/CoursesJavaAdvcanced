package com.curso.viernes;

import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

/*
  Información que contiene una URL
  	Protocol: En este caso http es el protocol.
  	Serve Name o IP Address: oracle y github
  	Port number: Es una atributo opciones. Si escribimos google.com:80, 80 es el puerto
  	si el puerto no es mencionado en la URL regresara -1.
  	File Name o Directory Name: /articulo/nombre
 */
public class Properties {

	public static void main(String[] args) throws IOException {
		InetAddress ip = InetAddress.getByName("www.oracle.com");
		System.out.println("nombre del host: " + ip.getHostName());
		System.out.println("direccion ip: " + ip.getHostAddress());
		
		URL url = new URL("https://github.com/alonsoContreras/CoursesJavaAdvcanced");
		System.out.println("protocolo: " + url.getProtocol());
		System.out.println("hostname: " + url.getHost());
		System.out.println("file name: " + url.getFile());
		System.out.println("puerto: " + url.getPort());
		
		HttpsURLConnection hus = (HttpsURLConnection) url.openConnection();
		for (int i = 1; i <= 8; i++) {
			System.out.println(hus.getHeaderFieldKey(i) + " = " + hus.getHeaderField(i));
		}
		
		hus.disconnect();
	}
}
