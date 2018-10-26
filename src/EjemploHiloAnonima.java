/**
 * Hilo simple con una clase anónima
 */
public class EjemploHiloAnonima 
{
    public static void main(String[] args)
    {
    	/*
    	 * Crea el hilo "segundoHilo" como clase anónima. Dentro del método run() del hilo
    	 * escribe diez números en la misma línea, y luego muestra las propiedades del hilo:
    	 * Nombre, Prioridad, Id, Estado, Si está vivo.
    	 */
         //A completar:
        Thread segundoHilo =  
            
        
        
        
        
        
        
        
        
        
        
        
        

        if(!segundoHilo.isAlive())
        {
            System.out.println("Segundo hilo todavía no vivo.");
        }
        // Ahora inicia segundoHilo
        //A completar:
        
        
        
        
        
        
        if(segundoHilo.isAlive())
        {
            System.out.println("Segundo hilo ahora vivo.");
        }
        // Ceder control al segundo hilo
        Thread.yield();
        if(!segundoHilo.isAlive())
        {
            System.out.println("Segundo hilo ya no está vivo.");
        }
        
        /* Ahora vamos  a escribir las propiedades del Main (de por sí hay un hilo
         * principal, que es el Main)
        * Nombre, Prioridad, Id, Estado, Si está vivo.
        * */
        System.out.println("Propiedades del hilo main.");
        //A completar:
        
        
        
        
        
        
        
        
        

    }
}

