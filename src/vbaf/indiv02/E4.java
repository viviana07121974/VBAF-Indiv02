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
public class E4 {
   public static void main(String[] args) {
        int n1,n2,suma;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introdusca primer numero:");
        n1 = teclado.nextInt();
        System.out.println("Introdusca segundo numero:");
        n2 = teclado.nextInt();
        suma = n1 + n2;
        System.out.println("La suma de:" + n1 + "mas" + n2 + suma + ".");
    } 
}
