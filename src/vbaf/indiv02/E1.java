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
public class E1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Introduzca un numero");
        numero = entrada.nextInt();
        if (numero >= 0)
            System.out.println("El numero positivo");
        else 
            System.out.println("El numero negativo");
    }
     
}
