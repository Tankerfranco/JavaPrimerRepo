package javapractica;

import java.util.Scanner;

/**
 *
 * @author franc
 */
/**EjercicioUno:
 *   Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
 *  dos. El programa deberá después mostrar el resultado de la suma
 */

public class javapractica {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int num, num2;
        System.out.println("Ingrese dos numero enteros");
        num = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("La suma de los dos numeros es: " + (num + num2));
    }
}
