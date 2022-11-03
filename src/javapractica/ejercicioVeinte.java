package javapractica;

import java.util.Scanner;

/**
 *
 * @author franc
 */

/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.*/

public class ejercicioVeinte {

    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        //1.Crear la matriz
        int[][] m = new int[3][3];
        //2.LLenar la matriz con numeros del 1-9
        llenar(m);
        //3.hacer la comprobacion de que sus filas, columnas y diagonales, sumadas dan lo mismo.
        comprobacion(m);
        //4.Mostrar la matriz.
        System.out.println("Matriz");
        imprimir(m);
    }
    
    //Llenar la matriz
    public static void llenar(int[][] m){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese numeros del 1-9");
                m[i][j] = leer.nextInt();
                while(m[i][j] <= 0 || m[i][j] >= 10){
                    System.out.println("Ingrese un numero valido.");
                    m[i][j] = leer.nextInt();
                }
            }
        }
        
    }
    
    //Comprobacion Matriz
    
    public static void comprobacion(int[][] m){
        int sumaFila = 0;
        int sumaCol = 0;
        int sumaDia = 0;
        int sumaDia2 = 0;
        //Suma fila, columnas y diagonal principal.
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                sumaFila = sumaFila + m[i][j];
                sumaCol = sumaCol + m[j][i];
                if (i == j) {
                    sumaDia = sumaDia + m[i][j];
                }    
            }
            sumaCol= 0;
            sumaFila = 0;
        }
        //Suma diagonal invertida.
        int a = (m.length)-1;
        for (int i = 0; i < m.length; i++) {
            sumaDia2 = sumaDia2 + m[i][a];
        }
       
        //Comprobacion.
        if(sumaCol == sumaFila || sumaFila == sumaDia || sumaDia == sumaDia2){
            System.out.println("la matriz es magica");
        }else{
            System.out.println("la matriz no es magica");
        }
    }
    
    //Imprimir matriz
    public static void imprimir(int[][] m){ 
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print("["+m[i][j]+"]");    
            }
            System.out.println("");
        }
    }
}

    