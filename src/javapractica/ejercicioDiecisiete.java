package javapractica;

import java.util.Scanner;

/**
 *
 * @author franc
 */

/**
 *  Ejercicio Diecisiete:
 *  Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
 *  de 2 dígitos, etcétera (hasta 5 dígitos).
 * 
 */

public class ejercicioDiecisiete {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args){
        int con;
        int uno = 0, dos = 0, tres = 0, cuatro=0, cinco= 0;
        System.out.println("Ingrese la cantidad de elementos del vector.");
        int n = leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random()*10000);
        }
        for (int i = 0; i < n; i++) {
            con = (int)(Math.log10(vector[i])+1);
            System.out.println(vector[i]);
            switch(con){
                case 1:
                    uno++;
                break;
                case 2:
                    dos++;
                break;
                case 3:
                    tres++;
                break;
                case 4:
                    cuatro++;
                break;
                case 5:
                    cinco++;
                break;
            }
        }
        System.out.println("Hay " + uno + " numeros con un digito, hay " + dos + " numeros con dos digitos, hay " + tres + " numeros con tres digitos, hay " + cuatro + " numeros con cuatro digitos y hay " + cinco + " numeros con cinco digitos.");
    }
}
