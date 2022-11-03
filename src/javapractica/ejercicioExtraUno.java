package javapractica;

import java.util.Scanner;

/**
 *
 * @author franc
 */

/*
Ejercicio Veintiuno:
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
*/
public class ejercicioExtraUno {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args){
        int minutos, dias, horas;
        System.out.println("Ingrese los minutos.");
        minutos = leer.nextInt();
        horas = (minutos*1)/60;
        dias = (horas*1)/24;
        System.out.println(minutos+ " minutos equivalen a "+horas+ " horas y "+dias+" dias");
    }
}
