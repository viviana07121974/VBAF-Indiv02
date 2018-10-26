/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        int suma,resta,multiplicasion,division,salir,num;
        suma = teclado.nextInt();
        System.out.println("Mostrar :"+ "suma1");
        resta = teclado.nextInt();
        System.out.println("Mostrar :"+ "resta2");
        multiplicasion = teclado.nextInt();
        System.out.println("Mostrar :"+ "multiplicasion3");
        division = teclado.nextInt();
        System.out.println("Mostrar :"+ "division4");
        salir = teclado.nextInt();
       System.out.println("Mostrar :"+ "salir5");
       num = 6;
       num = teclado.nextInt();
        System.out.println("Este numero no coincide con ninguna de las opciones disponibles:" );
    }
      
}
