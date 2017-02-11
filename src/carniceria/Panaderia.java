/*
    Ahora vamos a crear un programa que simule una carnicería. 
Se lanzarán 12 procesos, y tienen que entrar en la panadería y 
solicitar un número. 
Todos deben de tener un número distinto y no pueden repetirse.
*/
package carniceria;

import static carniceria.Carniceria.numero;


/**
 *
 * @author fuerm
 */
public class Panaderia extends Thread{
    private int numeroCliente;
    
    Panaderia(int numeroCliente){
        this.numeroCliente = numeroCliente;
    }
    public void  run(){   
       
        //Bloqueamos la clase donde está la variable estática
        synchronized(Carniceria.class ){
            System.out.println("Cliente número" + numeroCliente 
                    + " tiene el número " + numero );
            numero++;
        }
    }

}
