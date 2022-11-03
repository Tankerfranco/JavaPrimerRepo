package javapractica;
import java.util.Scanner;
/**
 *
 * @author franc
 */

/*Ejercicio Extra Diez:
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
*/

public class ejercicioExtraDiez {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        //1.crear las variables.
        int max = 10, min = 0, num1, num2, num3, num4, i = 0;
        boolean bo = true;
        //2.Hacer la multiplicacion de los numeros random
        num1 = (int) (Math.random() * ((max - min) + 1)) + min;
        num2 = (int) (Math.random() * ((max - min) + 1)) + min;
        num3 = num1 * num2;
        //3.pedirle al usuario que adivine el numero.
        System.out.println("Adivine el resultado.");
        while (bo) {
            num4 = leer.nextInt();
            if (num4 == num3) {
                System.out.println("Correcto, ese es el numero.");
                bo = false;
            } else if (i == 5) {
                System.out.println("oh se te acabaron los intentos, el numero era: " + num3);
                bo = false;

            } else {
                System.out.println("Incorrecto, ese no es el numero.");
                System.out.println("Intentalo de vuelta.");
            }
            i++;
        }

    }
}
