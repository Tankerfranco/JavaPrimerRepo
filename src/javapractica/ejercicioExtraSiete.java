package javapractica;

import java.util.Scanner;

/**
 *
 * @author franc
 */

/*Ejercicio Extra Siete:
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.

*/
public class ejercicioExtraSiete {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Forma While");
        formaWhile();
        System.out.println("Forma Do While");
        formaDoWhile();
        
    }
    
    public static void formaDoWhile(){

        int n,num, numMax=0,numMin=10000,i=0,suma=0;
        System.out.println("Cuantos numeros quiere ingresar?");
        n = leer.nextInt();
        do{
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            suma = num + suma;
            if (num > numMax) {
                numMax = num;
            }
            if (num < numMin) {
                numMin = num;
            }
            i++;
        }while(n!=i);
        System.out.println("El valor maximo es de: " + numMax+" y el valor minimo es de: "+numMin );
        System.out.println("El promedio es de " + (suma/i));
    }
    
    public static void formaWhile(){
        int num, n,i=1,numMax,numMin, suma=0;
        System.out.println("Ingrese el valor de n.");
        n = leer.nextInt();
        while(n<0){
            System.out.println("n tiene que ser mayor a 0, Ingrese el valor de vuelta");
            n = leer.nextInt();
        }
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        numMax=num;
        numMin=num;
        suma = suma+num;
        while (n != i) {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            suma=suma+num;
            if (num > numMax) {
                numMax = num;
            }
            if (num < numMin) {
                numMin = num;
            }
            i++;
        }
        System.out.println("El valor maximo es de: " + numMax+" y el valor minimo es de: "+numMin );
        System.out.println("El promedio es " + (suma/i));
    }
}
