package com.curso.jueves.actividad;

public class Actividad  extends Thread
{
   
    
    
    public void run()
    {
        System.out.println("Soy un hilo corriendo");        
    }
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {       
           
        System.out.println("-----------------------------------------------------------------------------------");
        System.err.println("run()");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(Definiciones.run);
        
        //////////////////////////
        Hilos t = new Hilos();
        Thread t1 = new Thread(t);
        t1.run();
        
        
        System.out.println("-----------------------------------------------------------------------------------");
        System.err.println("star()");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(Definiciones.star);
        
        ////////////////////////
        Hilos r1 = new Hilos();
        Thread t2 = new Thread(r1);
        t2.start();
                        
        System.out.println("-----------------------------------------------------------------------------------");
        System.err.println("clone()");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(Definiciones.clone);
        
        ///////////////////////
        
        
        System.out.println("-----------------------------------------------------------------------------------");
        System.err.println("yield()");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(Definiciones.yield);
        
        //////////////////////
        Thread.yield();
        
        System.out.println("-----------------------------------------------------------------------------------");
        System.err.println("setPriority()");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(Definiciones.setPriority);
                
        //////////////////////
        t1.setPriority(1);
        
        System.out.println("------------------------------------------------------------------------------------");
        System.err.println("getPriority()");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(Definiciones.getPriority);              
        
        //////////////////////
        System.out.println("La prioritad del hilo es: " + t1.getPriority());
                
        System.out.println("------------------------------------------------------------------------------------");
        System.err.println("setName()");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(Definiciones.setName);
        
        //////////////////////
        t1.setName("Hilo Uno");
        
        System.out.println("------------------------------------------------------------------------------------");
        System.err.println("getName()");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(Definiciones.getName);
        
        /////////////////////
        System.out.println("El nobre del hilo es :" + t1.getName());                
        
        System.out.println("------------------------------------------------------------------------------------");
        System.err.println("currentThread()");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(Definiciones.currentThread);
        
        ////////////////////
        Thread currThread = Thread.currentThread(); 
        System.out.println("current thread = " + currThread);
        
        System.out.println("------------------------------------------------------------------------------------");
        System.err.println("getId()");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(Definiciones.getId);
        
        ///////////////////
        System.out.println("id = " + currThread.getId());
        
        System.out.println("------------------------------------------------------------------------------------");
        System.err.println("getState()");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(Definiciones.getState);
        
        ///////////////////
        Thread.State state = Thread.currentThread().getState();
        System.out.println("state = " + state);
        
        
        System.out.println("------------------------------------------------------------------------------------");
        System.err.println("isAlive()");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(Definiciones.isAlive);
        
        //////////////////
        System.out.println("isAlive = " + currThread.isAlive());
        
        
        System.out.println("------------------------------------------------------------------------------------");
        System.err.println("stop()");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(Definiciones.Stop);
        
        /////////////////////////////////////
        
        t1.stop();
        
        System.out.println("------------------------------------------------------------------------------------");
        System.err.println("isDaemon()");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(Definiciones.isDaemon);
        
        ////////////////////////////////////
        System.out.println("Es demon" + t1.isDaemon());
        
        System.out.println("------------------------------------------------------------------------------------");
        System.err.println("setDaemon()");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(Definiciones.setDaemon);
        
        ///////////////////////////////////
        t1.setDaemon(true);
        System.out.println("Es demon" + t1.isDaemon());
        
        System.out.println("------------------------------------------------------------------------------------");
        System.err.println("Interrupt()");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(Definiciones.Interrupt);
        
        /////////////////////////////////
        t1.interrupt();
        
        System.out.println("------------------------------------------------------------------------------------");
        System.err.println("interupted()");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(Definiciones.interupted);
        
        System.out.println("------------------------------------------------------------------------------------");
        System.err.println("isInterrepted()");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(Definiciones.isInterrepted);
        
         ///////////////////////////////
        System.out.println("El Hilos esta interrunpio " + t1.isInterrupted());
        
        
        System.out.println("------------------------------------------------------------------------------------");
        System.err.println("suspend()");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(Definiciones.suspend);
        
        //////////////////////////////        
        t1.suspend();
        
               
        System.out.println("------------------------------------------------------------------------------------");
        System.err.println("join()");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(Definiciones.join);
        
       t2.join();
       
       
        
    }
    
//     public static void main(String[] args) {
//        HilosT t1 = new HilosT();
//        t1.start();          
//        
//        Hilos t = new Hilos();
//        Thread t2 = new Thread(t);
//        t2.start();
//       
//        
//    }        
    
    
}
class Hilos implements Runnable
{

    @Override
    public void run() {
        System.out.println("Hilo dos esta corriendo");
    }
    
}
class Definiciones
{
    public static String run = "El método run() constituye el cuerpo de un hilo en ejecución. Este es el único método del interfaz Runnable. Es llamado por el método start() después de que el hilo apropiado del sistema se haya inicializado. Siempre que el método run() devuelva el control, el hilo actual se detendrá";
    
    public static String star = "Este método indica al intérprete de Java que cree un contexto del hilo del sistema y comience a ejecutarlo. A continuación, el método run() de este hilo será invocado en el nuevo contexto del hilo. Hay que tener precaución de no llamar al método start() más de una vez sobre un hilo determinado.";
    
    public static String clone = "Clone no se describe específicamente como thread-safe, lo que significa que no lo es. Si un hilo está clonando el objeto mientras otro hilo lo está cambiando, el clon puede terminar en un estado inconsistente.\n" +
                        "\n" +
                        "\n" +
                        "Usted podría agarrar una cerradura en su función del clon, pero mucho mejor sería agarrarla en el código que llama el clon.";

    public static String yield = "El método yield() tiene la función de hacer que un hilo que se está ejecutando de regreso al estado en “listo para ejecutar” para permitir que otros hilos de la misma prioridad puedan ejecutarse. Sin embargo, el funcionamiento de este método (al igual que de los hilos en general) no está garantizado, puede que después de que se establezca un hilo por medio del método yield() a su estado “listo para ejecutar”, éste vuelva a ser elegido para ejecutarse. El método yield() nunca causará que un hilo pase a estado de espera/bloqueado/dormido, simplemente pasa de ejecutándose(running) a  “listo para ejecutar”.\n" +
                        "A continuación tomando el ejemplo anterior solo haremos una modificación en el método run, vemos como se implementa dicho metodo:";
    
    public static String  setPriority = 
                        "Para establecer la prioridad de un thread se utiliza el método setPriority() de la siguiente manera:\n" +
                        "\n" +
                        "\n" +
                        "       h1.setPriority(10);\n" +
                        "       h1.setPriority(1);\n" +
                        "\n";
    public static String getPriority = "Para obtener el nivel del prioridad de un subproceso se usa la función getPriority\n" +
                        "\n" +
                        "int prioridad=hilo1.getPriority();";
    
    public static String setName = "Este método permite identificar al hilo con un nombre menmónico."
            + "\n"
            + "setName( \"MI HILO\" )";
    
    public static String getName = "Este método devuelve el valor actual, de tipo cadena, asignado como nombre al hilo en ejecución mediante setName().";
    
    
    public static String currentThread = " regresa el nombre del subproceso, la prioridad y el grupo donde esta el subproceso";
    
    public static String getId =  "regresa el identificador del proceso en ejecucion el cual es unico en todo el proceso de vida del hilo";
    
    public static String getState = "regresa el estado del subproceso runnable";
    
    public static String isAlive = "valida si aun el hilo esta activo, si se ha iniciado y aún no ha muerto";
    
    public static String Stop = "Es un metodo deprecado de la clase thread, el cual detiene el thread y puede ocasionar que desbloquee todo\n" +
                            "      los procesos que pudieran estar bloqueados, esto pudiera ocasionar que se lanze una excepcion de tipo ThreadDeath\n" +
                            "      de la misma manera pudiera usarse para lanzar excepciones en puntos que no estan preparados para manejarlos.\n" +
                            "      Por consecuente es considerado un metodo inseguro.";
    
    public static String isDaemon  = "Para probar que el es un deamon o no.";
    
    public static String setDaemon = "Indica que un Thread es un deamon o un User Thread.";
    
    public static String Interrupt = "Sirve para interrumpir un Thread, pero si el Thread ya se encuentra asi puede causar la excepcion\n" +
                                "           SecurityException, al igual que tambien puede ser usado para interrumpir un Thread el cual se encuentra\n" +
                                "           en espera por un largo periodo de tiempo.  Como ejemplo del anterior\n" +
                                "	   public void stop() {\n" +
                                "     		   Thread moribund = waiter;\n" +
                                "	           waiter = null;\n" +
                                "	           moribund.interrupt();\n" +
                                "    	   }\n" +
                                "	   Pero en esta caso puediera lanzarse un InterruptedException.";
    
    public static String suspend = "Este metodo pone a un hilo en estado de suspendido y puede ser activado usando el metodo resume()."; 
    public static String interupted = "Una interrupción es una indicación al hilo de que este debe de detener lo que esta haciendo y hacer algo mas. Es decisión del programador decidir exactamente como va a responder el hilo a una interrupción.";
    public static String isInterrepted = "Comprueba si el hilo ha sido interrumpido. El estado interrumpido del hilo no se ve    afectado por este método.";
    public static String join = "Permite que un hilo espere a la terminación de otro. Puede utilizarse para pausar la ejecución del hilo actual hasta que el hilo especificado esté muerto.";
    
}
