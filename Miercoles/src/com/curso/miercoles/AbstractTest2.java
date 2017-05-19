package com.curso.miercoles;

abstract class Shape {
	abstract void draw();
}
//En un escenario real, la implementación la provee algo mas
class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("drawing rectangles :D");
	}
	
}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("drawing circles :D");
	}
	
}

public class AbstractTest2 {

	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
		
		Shape s2 = new Rectangle();
		s2.draw();
	}
}
