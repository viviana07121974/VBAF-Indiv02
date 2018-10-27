/*

 */
package vbaf.indiv02;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class E5 {
  public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
           int opcion;
           System.out.println("Escribe una de las opciones:");
                 System.out.println("1.suma 1");
             System.out.println("2.Resta 2");
             System.out.println("3.Multiplicasion 3");
             System.out.println("4.Division 4");
             System.out.println("5.Salir");
                opcion = teclado.nextInt();
                  switch(opcion){
                   case 1:
                     System.out.println("Has seleccionado la opcion 1");   
                     break;
                    case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    break;
                    case 3:
                    System.out.println("Has seleccionado la opcion 2");
                    break;
                    case 4:
                    System.out.println("Has seleccionado la opcion 4");
                    break;
                    case 5:
                    System.out.println("Has seleccionado la opcion 5");    
                     break;
                   
                   
                    
                    default:
                   System.out.println("Solo numeros entre 1 y 5");
                        break;
               }
                  
         
            
                    
                  
         
                    
  }
}
                    
                    
                    
                    
  
  
  

                     
                
                

