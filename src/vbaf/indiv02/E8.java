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
public class E8 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Introduce un numero entero:");
        n = sc.nextInt();
        System.out.println("Tabla del:" + n);
        for(int i = 1; i<= 10; i++){
            System.out.println(n + "*" + i + "=" + n *i);
        }
}
}
