package javapractica;

import java.util.Scanner;

/**
 *
 * @author franc
 */

/*Ejercicio Extra Seis:
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
*/
public class ejercicioExtraSeis {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("A cuantas personas vamos a preguntarle su altura?");
        int n = leer.nextInt();
        double altura,Sumalturas=0,SumaAlturas=0;
        int j=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Hola " + i +  " , Cuanto mide?");
            altura = leer.nextDouble();
            SumaAlturas+=altura;
            if(altura < 1.60){
            Sumalturas += altura;
            j++;
        }
        }
        System.out.println("el promedio de estaturas debajo de 1.60 es de: " + (Sumalturas/j)+ " y el promedio de estaturas general es de: " + (SumaAlturas/n) );
    }
}
