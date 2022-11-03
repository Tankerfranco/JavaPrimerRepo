package javapractica;

import java.util.Scanner;

/**
 *
 * @author franco
 */

/*Ejercicio Extra Nueve:
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
*/
public class ejercicioExtraNueve {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args){
       int cociente = 0, residuo=0, num2;
        System.out.println("Ingrese dos enteros.");
        residuo = leer.nextInt();
        num2 = leer.nextInt();
        
        while(residuo>num2){   
            residuo = residuo - num2;
            cociente++;
        }
        System.out.println("El residuo es " + residuo+" y el cociente es "+ cociente);
       
    }
}
