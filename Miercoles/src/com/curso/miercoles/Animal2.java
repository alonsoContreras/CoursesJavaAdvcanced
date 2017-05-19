package com.curso.miercoles;

public class Animal2 
{
    void eat()
    {
        System.out.println("Eating..!!");
    }
    
}
class Dog2 extends Animal2
{
    void run()
    {
        System.out.println("Runnin");
    }
    
}
class Cachorro extends  Dog2
{
    void DrinkMilk()
    {
        System.out.println("Drink Milk");
    }    
}
class Herencia
{
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.eat();
        cachorro.run();
        cachorro.DrinkMilk();
    }
   

}
