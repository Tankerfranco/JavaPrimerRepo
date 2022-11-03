package javapractica;

import java.util.Scanner;

/**
 *  Ejercicio Diesiocho:
 *  Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
 *  traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
 *  cambiando sus filas por columnas (o viceversa).
 */

public class ejercicioDieciocho {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args){
        //Relleno random de la matriz.
        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]= (int)(Math.random()*10);
            }
        }
        System.out.println("Matriz Original.");
        //Mostrar la matriz original.
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+matriz[i][j]+ "]");
            }
            System.out.println("");
        }
        //Matriz Transpuesta.
        int aux;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
        //Imprimir Matriz Transpuesta.
        System.out.println("");
        System.out.println("Matriz Transpuesta.");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
