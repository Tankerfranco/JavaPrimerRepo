package javapractica;

import java.util.Scanner;

/**
 *
 * @author franc
 */

/**
 *  Ejercicio Catorce:
 *  Crea una aplicación que a través de una función nos convierta una cantidad de euros
 *  introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
 *  función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
 *  una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
 *  (void).
 *  El cambio de divisas es:
 *  0.86 libras es un 1 €
 *  1.28611 $ es un 1 €
 *  129.852 yenes es un 1 €
 */

public class ejercicioCatorce {
static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args){
        double euros = introducirEuros();
        String moneda = introducirMoneda();
        double cambio = cambiarMoneda(euros,moneda);
        imprimir(cambio,moneda);
    }
    
    public static double introducirEuros(){
        System.out.println("Ingrese la cantidad de euros");
        double euros = leer.nextDouble();
        return euros;
    }
    
    public static String introducirMoneda(){
        System.out.println("Ingrese la moneda a la que quieres cambiar");
        String moneda = leer.next();
        System.out.println("el cambio sera a " + moneda);
        return moneda;
    }
    
    public static double cambiarMoneda(double euros, String moneda) {
        double cambio = 0.0;
        switch (moneda) {
            case "libra":
                cambio = euros * 0.87;
                break;
            case "dolares":
                cambio = euros * 1.11;
                break;
            case "yenes":
                cambio = euros * 120.63;
                break;
        }
        return cambio;
    }

    public static void imprimir(double cambio, String moneda){
        System.out.println("el resultado del cambio es " + cambio + " " + moneda);
    }
   
    
    
}

