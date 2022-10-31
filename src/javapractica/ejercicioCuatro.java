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
 * Ejercicio Cuatro:
 * Dada una cantidad de grados centígrados, se debe mostrar su equivalente en grados
 * Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class ejercicioCuatro {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int grados;
        double fahrenheit;
        System.out.println("Ingrese cuantos grados hacen");
        grados = leer.nextInt();
        fahrenheit = 32 + (9*grados/5);
        System.out.println(grados + " grados Centigrados equivalen a " + fahrenheit + " grados Fahrenheit.");
    }
    
}
