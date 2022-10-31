/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractica;

import java.util.Scanner;

/**
 *
 * @author franc
 */

/**
 *Ejercicio Tres:
 *Escribir un programa que pida una frase, la muestre toda en mayúsculas y después toda
 * en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */

public class EjercicioTres {
   public static void main(String[] args){
       Scanner leer = new Scanner(System.in);
       String frase;
       System.out.println("Ingrese una frase");
       frase = leer.nextLine();
      
       System.out.println(frase.toLowerCase());
       System.out.println(frase.toUpperCase());
       
   }
}
