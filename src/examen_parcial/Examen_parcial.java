/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_parcial;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Examen_parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        
       Scanner input=new Scanner(System.in);
        System.out.println("Examen Parcial");
        System.out.println("Brayan Ñahuis");
        System.out.println("");
        System.out.println("Catalogo de Telefonos Moviles");
        System.out.println("");
        System.out.println("Telefonos Moviles\n ");
        System.out.println(" [1] Samsung ");
        System.out.println(" [2] IPhone 6 ");
        System.out.println(" [3] Huawei P8 ");
        System.out.println("\nSeleccione  un Modelo");
        
       char opcion=input.next().charAt(0);
        switch(opcion){
            case 1:
                System.out.println(" Pantalla  :  4.7");
                System.out.println(" Camara    :  8Mp");
                System.out.println(" Procesador :  1.4Ghz");
                break;
                
            case 2:
                System.out.println(" Pantalla  :  5");
                System.out.println(" Camara    :  12Mp");
                System.out.println(" Procesador :  1.4Ghz");
                break;
                
             case 3:
                System.out.println(" Pantalla  :  6");
                System.out.println(" Camara    :  16Mp");
                System.out.println(" Procesador : 1.4Ghz");
                break;
             default:
        }
        
               System.out.println("Seleccione Operador");
               System.out.println("  [C]laro");
               System.out.println("  [M]ovistar");
               System.out.println("  [E]ntel");
        
               char operador=input.next().charAt(0);
               switch(operador){
                   
                   case 1:
                       System.out.println( " Claro Max 99");
                       System.out.println(" Precio    : S/ 99" );
                       System.out.println(" Minutos   :  Ilimitados" );
                       System.out.println(" RPC       :  Ilimitados" );
                       System.out.println(" Internet  :  6 GB" );
                       System.out.println(" SMS       :  Ilimitados" );
                       System.out.println("");
                       
                                           
           
        }
        
       
       
       
     
       
       
       
        
        
        
        
        
        
    }
    
}
