package javapractica;

import java.util.Scanner;

/**
 *
 * @author franc
 */
/*Ejercicio Extra Ocho:
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
*/
public class ejercicioExtraOcho {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args){
        int n=0,num,numP=0,numI=0;
        boolean con = true;
        while(con){
            System.out.println("Ingrese numeros enteros");
            num = leer.nextInt();
            n++;
            if(num % 2 == 0){
                numP++;
            }else{
                numI++;
            }
            if(num % 5 == 0){
                con = false;
            }
        }
        System.out.println("Los numeros leidos fueron: " + n+", los numeros pares fueron: " + numP+" Y los impares: " + numI);
    }
}
