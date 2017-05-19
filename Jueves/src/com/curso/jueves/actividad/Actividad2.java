package com.curso.jueves.actividad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Actividad2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new FileReader(
					"C:\\lunes\\Archivo.txt"));
			try {
				System.out.println("Empezando...");
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();

				while (line != null) {
					sb.append(line);
					sb.append(System.lineSeparator());
					line = br.readLine();
				}
				String everything = sb.toString();
				System.out.println(everything);
				Thread.sleep(1000);
				List<String> lines = Arrays.asList(everything, "Termino");
				Path file = Paths.get("C:\\lunes\\Archivo2.txt");
				Files.write(file, lines, Charset.forName("UTF-8"));
				System.out.println("Termino...");
			} finally {
				br.close();
			}
		} catch (InterruptedException ex) {
			System.out.println(ex);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws IOException {
		Thread t = new Thread(new Actividad2());
		t.start();
	}
}
