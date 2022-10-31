package javapractica;
import java.util.Scanner;
/**
 *
 * @author franc
 */

/**
 * Ejercicio Seis:
 * Crear un programa que dado un numero determine si es par o impar.
 */
public class ejercicioSeis {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        if(num % 2 == 0){
            System.out.println("El numero es Par.");
        }else{
            System.out.println("El numero es Impar.");
        }
    }

}
