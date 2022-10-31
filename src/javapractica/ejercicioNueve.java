package javapractica;
import java.util.Scanner;
/**
 *
 * @author franc
 */

/**
 * Ejercicio Nueve:
 * Escriba un programa, que pida una frase o palabra y valide si la primera letra de esa frase
 * es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
 * diga “CORRECTO”; en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
 * la función Substring y equals() de Java.
 */
public class ejercicioNueve {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase.");
        frase = leer.nextLine();
        if(frase.substring(0,1).equals("a")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
}
