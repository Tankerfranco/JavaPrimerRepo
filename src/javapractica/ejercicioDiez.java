package javapractica;

import java.util.Scanner;

/**
 *
 * @author franc
 */

/**
 *  Ejercicio Diez:
 *  Escriba un programa, en el cual se ingrese un valor límite positivo, y a continuación solicite
 *  números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 * 
 */
public class ejercicioDiez {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int num, max;
        int suma = 0;
        System.out.println("Ingrese un limite para el valor positivo.");
        max = leer.nextInt();
        while(max < 0){
            System.out.println("Ingrese un numero correcto");
            max = leer.nextInt();
        }
        do{
            System.out.println("Ingrese un numero.");
            num = leer.nextInt();
            suma += num;
        }while(max > suma);
        System.out.println("Se alcanzo el valor maximo.");
    }
}
