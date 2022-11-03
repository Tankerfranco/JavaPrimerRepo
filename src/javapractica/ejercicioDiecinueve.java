package javapractica;

import java.util.Scanner;

/**
 *  Ejercicio Diecinueve:
 *  Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
 *  matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
 *  signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
 *  denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 *
 */
public class ejercicioDiecinueve {
    private static Scanner leer = new Scanner(System.in);
    public static void main(String[] args){
        int n;
        boolean a = false;
        System.out.println("Ingrese la dimension de su matriz cuadrada.");
        n = leer.nextInt();
        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese su numero.");
                m[i][j] = leer.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(m[i][j]!= -m[j][i])
                    a = true;
            }
            
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("["+ m[i][j]+"]");
            }
            System.out.println("");
        }
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("["+ (m[j][i])+"]");
            }
            System.out.println("");
        }
        
        if (a) {
            System.out.println("la matriz no es antisimetrica");
        }else{
            System.out.println("la matriz es antisimetrica");
        }
                
    }
}
