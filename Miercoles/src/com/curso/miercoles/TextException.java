package com.curso.miercoles;

import java.io.IOException;

public class TextException {

	public static void main(String[] args) {
		try {
			M m = new M();
			m.method();
//			int data = 50 / 0;
//			int a[] = new int [5];
//			a[5] = 30/0;
		} catch (ArithmeticException ex) {
			System.out.println(ex);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (Exception et) {
			System.out.println(et);
		}
		System.out.println("Lo que sigue");
	}
}

class M {
	void method() throws IOException {
		throw new IOException("error");
	}
}