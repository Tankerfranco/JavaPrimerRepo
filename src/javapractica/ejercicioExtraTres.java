package javapractica;

import java.util.Scanner;

/**
 *
 * @author franc
 */

/*Ejercicio Extra Tres:
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
*/
public class ejercicioExtraTres {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Ingrese una letra");
        String letra = leer.nextLine();
        switch(letra){
            case "a":
                System.out.println("Tu letra es una vocal");
            break;
            case "e":
                System.out.println("Tu letra es una vocal");
            break;
            case "i":
                System.out.println("Tu letra es una vocal");
            break;
            case "o":
                System.out.println("Tu letra es una vocal");
            break;
            case "u":
                System.out.println("Tu letra es una vocal");
            break;
            default:
                System.out.println("Tu letra no es una vocal.");
        }
    }
}
