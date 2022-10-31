package javapractica;

import java.util.Scanner;

/**
 *
 * @author franc
 */

/**
 *  Ejercicio Dieciseis:
 *  Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
 *  usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
 *  numero y si se encuentra repetido.
 */
public class ejercicioDieciseis {
static Scanner leer = new Scanner(System.in);
    public static void main(String[] args){
        int num;
        int con = 0;
        System.out.println("Ingrese cuantos elementos tendra el vector.");
        int n = leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random()*10);
        }
        System.out.println("Escribe un numero");
        num = leer.nextInt();
        for (int i = 0; i < n; i++) {
            if (num == vector[i]) {
                System.out.println("el numero " + num + " se encuentra en la posicion " + i + " del vector");
                con++;
            }
        }
        if(con > 1){
            System.out.println("tu numero se repite " + con + " veces.");
        }else{
            System.out.println("el numero " + num + " solo se repite una vez o simplemente no esta en el vector.");
        }
      
    }
}
