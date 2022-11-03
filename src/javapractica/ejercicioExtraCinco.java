package javapractica;

import java.util.Scanner;

/**
 *
 * @author franc
 */

/*Ejercicio Extra Cinco:
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
*/

public class ejercicioExtraCinco {
    static Scanner  leer = new Scanner(System.in);
    public static void main(String[] args){
        //3 socios, A, B y C.
        String socio;
        System.out.println("Que tipo de socio es?");
        socio = leer.next();
        switch(socio){
            case "A":
                System.out.println("Los socios A, pagan 100 pesos por el tratamiento.");
                System.out.println("Descontando el 50%, el pago seria de " + ((50*100)/100)+ " pesos.");
            break;
            case "B":
                System.out.println("Los socios B, pagan 75 pesos por el tratamiento.");
                System.out.println("Descontando el 35%, el pago seria de " + ((35*100)/75)+ " pesos.");
            break;
            case "C":
                System.out.println("Los socios C, pagan 50 pesos por el tratamiento.");
                System.out.println("No reciben descuentoa asi que el pago seria de 50 pesos.");
            break;
            default:
                System.out.println("Tipo no valido.");
        }
    }
}
