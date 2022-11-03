package javapractica;

import java.util.Scanner;

/**
 *
 * @author franc
 */

/* Ejercicio Extra Cuatro:
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
*/
public class ejercicioExtraCuatro {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Ingrese un numero del 1 al 10");
        int num = leer.nextInt();
        while(num <= 0 || num >= 11){
            System.out.println("Numero equivocado, prueba de vuelta.");
            num = leer.nextInt();
        }
        switch(num){
            case 1:
                System.out.println("I");
            break;
            case 2:
                System.out.println("II");
            break;
            case 3:
                System.out.println("III");
            break;
            case 4:
                System.out.println("IV");
            break;
            case 5:
                System.out.println("V");
            break;
            case 6:
                System.out.println("VI");
            break;
            case 7:
                System.out.println("VII");
            break;
            case 8:
                System.out.println("VIII");
            break;
            case 9:
                System.out.println("IX");
            break;
            case 10:
                System.out.println("X");
            break;
        }
    }
}
