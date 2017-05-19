package com.curso.martes;

public class Contador {
	static int count = 0;
	
	public Contador(){
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Contador c1 = new Contador();
		Contador c2 = new Contador();
	}
}
