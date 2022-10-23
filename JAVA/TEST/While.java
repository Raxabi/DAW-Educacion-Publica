import java.util.Scanner;

/**
 * Programa que realiza un numero de saludos que el usuario indica
 */

public class While {
    public static void main(String[] args) {
        int greetTimes;
        int counter = 0;
        Scanner sc = new Scanner(System.in);
            // Solicicitar al usuario el numero de veces del saludo
        System.out.print("Numero de veces del saludo: ");

        greetTimes = sc.nextInt();
        sc.close();

        /* System.out.print("Con bucle for");
        for (int i = 0; i < greetTimes; i++) {
            System.out.println("Hola");
        } */

        /* System.out.println("Con bucle While");
        while(contador < greetTimes) {
            System.out.println("Hola");
            counter++;
        } */

        /* System.out.println("Con bucle do-while");
        do {
            System.out.println("Hola");
            counter++;
        } while (counter < greetTimes); */
    }
}