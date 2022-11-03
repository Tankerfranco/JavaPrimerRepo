package javapractica;
import java.util.Scanner;

/**
 *
 * @author franc
 */

/*Ejercicio Extra Once:
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
*/

public class ejercicioExtraOnce {
static Scanner leer = new Scanner(System.in);
    public static void main(String[] args){
        //1.Leer el entero
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        //2.Ver cuantos digitos tiene el numero.
        int digi;
        digi = (int)(Math.log10(num)+1);
        //3.Mostrar cuantos digitos tiene el numero.
        System.out.println("El numero "+num+" tiene "+digi+" digitos.");
    }
}
