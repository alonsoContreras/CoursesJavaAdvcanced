package com.curso.viernes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class TestIO2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\lunes\\Archivo.txt");
		FileInputStream fis2 = new FileInputStream("C:\\lunes\\Archivo2.txt");

		FileOutputStream fos = new FileOutputStream("C:\\lunes\\Archivo3.txt");
		
		SequenceInputStream sis = new SequenceInputStream(fis, fis2);

		int i;
		while ((i = sis.read()) != -1) {
			System.out.print((char) i);
			fos.write(i);
		}
		sis.close();
		fis.close();
		fis2.close();
		fos.close();
	}
}
