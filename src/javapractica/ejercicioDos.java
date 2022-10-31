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
 * Ejercicio Dos:
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
 * pantalla.
 */


public class ejercicioDos {
    public static void main(String[] args){
        Scanner uwu = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre");
        nombre = uwu.nextLine();
        System.out.println("tu nombre es: " + nombre);
    } 
}
