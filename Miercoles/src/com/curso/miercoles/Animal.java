package com.curso.miercoles;

public class Animal 
{
    void eat()
    {
        System.out.println("Comiendo");
    }    
}
class Dog extends Animal
{
    void run()
    {
        System.out.println("Corriendo");
    }
}
class Prueba
{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.run();
    }
}
