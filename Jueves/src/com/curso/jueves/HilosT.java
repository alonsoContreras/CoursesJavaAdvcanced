package com.curso.jueves;

/*
  (Paralelismo) Multihilos en java: Es el proceso para ejecutar muchos hilos de manera simultanea.
  Hilo: Subproceso ligero, unidad muy pequeña de procesamiento.
  (Concurrencia): Multiprocesamiento y multhilo se utilizan para lograr la multitarea, en la concurrencia
  pueden o no ser multiprocesamiento.
  
  Ventas de usar hilos:
  	1. No bloqueamos al usuario por que son tareas independientes y se pueden realizar muchas tareas al mismo
  	tiempo.
  	2- Podemos realizar muchas tareas al mismo tiempo.
  	3. Los hilos al ser indpendientes no se afectan entre si, en caso de ocurrir una excepcion en un hilo
  	los demas funcionan igual.
  	
  Multitarea: Proceso de ejecucion de muchas tareas, Usamos la multitarea para utilizar el CPU. La multitarea
  se logra de dos maneras.
  	1. Multitarea basada en procesos.
  		* Cada proceso tiene su propia direccion en memoria, es decir cada proceso asigna una area separada
  		 de memoria.
  		* El proceso es pesado.
  			* El costo de la comunicacion entre el proceso es alto.
  			* Cambiar de un proceso a otro requeiere de tiempo para guardar y cargar registros, mapas de memoria
  			  listas de actualización etc..
    2. Multitarea basada en hilos (Multihilos)
      	* Los hilos comparten los mismos espacios en memoria para direcciones.
      	* El hilo es ligero.
      	* El costo de comunicacion entre hilos es bajo.
  
  Un hilo es un subproceso ligero, es independiente, si se produce una excepcion en hilo no afecta alos demas hilos
  y comparten un area de memoria en comun.
  
  Ciclo de vida de un hilo:
  	1. New: El hilo esta en este estado, si se crea una instancia de la clase Thread pero antes de la invocación del metodo
  	start().
  	2. Runnable: El hilo esta en este esado, despues de la invocación start(), pero el thread Scheduler(Adiministrador de hilos)
  	no lo ha seleccionmado como el hilo en ejecucion.
  	3. Running: Esta aqui cuando el Thread Scheduler lo ha seleccionado.
  	4. Non-Runnable (Blocked): Es el estado cuando el hilo sigue activo, sin embargo no es apto para ejecutarse.
  	5. Terminated: Es el estado cuando a finalizado o muerto, cuando sale del metodo run.
  	
  Hay 2 formas de crear un hilo:
  	1. Al extender de la clase Thread.
  	2.Al implementar la interface Runnable.
  
  Clase Thread
  Proporciona los constructores y metodos para crear y realizar operaciones en un hilo. La clase Thread extiende de la clase
  Object e implementa la interface Runnable.
  	Constructores de la clase Thread.
  		Thread()
  		Thread(String name)
  		Thread(Runnable r)
  		Thread(Runnable r, String name)
  Runnable
   La interfaz debe ser implementada por cualquier clase cuyas instancias esten destinadas a ser ejecutadas por un hilo.
   Tiene solo metodo denominado run. El cual es usuado para realizar las operaciones del hilo.
 */
public class HilosT extends Thread {

	@Override
	public void run() {
		System.out.println("Soy un hilo corriendo...");
	}
	
	public static void main(String[] args) {
		HilosT t1 = new HilosT();
		t1.start();
		
		Hilos t2 = new Hilos();
		Thread t = new Thread(t2);
		t.start();
	}
}

class Hilos implements Runnable {

	@Override
	public void run() {
		System.out.println("El hilo 2 esta corriendo..");
	}
	
}
