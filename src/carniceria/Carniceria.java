/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carniceria;

/**
 *
 * @author fuerm
 */
public class Carniceria {
    
    
    public static int numero = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=1; i<13;i++){
            new Panaderia(i).start();
        }
    }
    
}
