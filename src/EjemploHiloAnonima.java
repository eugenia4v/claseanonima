/**
 * Hilo simple con una clase an�nima
 */
public class EjemploHiloAnonima 
{
    public static void main(String[] args)
    {
    	/*
    	 * Crea el hilo "segundoHilo" como clase an�nima. Dentro del m�todo run() del hilo
    	 * escribe diez n�meros en la misma l�nea, y luego muestra las propiedades del hilo:
    	 * Nombre, Prioridad, Id, Estado, Si est� vivo.
    	 */
         //A completar:
        Thread segundoHilo =  
            
        
        
        
        
        
        
        
        
        
        
        
        

        if(!segundoHilo.isAlive())
        {
            System.out.println("Segundo hilo todav�a no vivo.");
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
            System.out.println("Segundo hilo ya no est� vivo.");
        }
        
        /* Ahora vamos  a escribir las propiedades del Main (de por s� hay un hilo
         * principal, que es el Main)
        * Nombre, Prioridad, Id, Estado, Si est� vivo.
        * */
        System.out.println("Propiedades del hilo main.");
        //A completar:
        
        
        
        
        
        
        
        
        

    }
}

