import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {      
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el año actual: ");

        int yearInput = sc.nextInt();

        // Si el año no es el año actual entonces se `cierra` el objeto y se lanza un error terminando el programa
        if (yearInput != 2022) {
            sc.close();
            throw new Error("El año debe ser el año actual, 2022. A la hora de introducir el año escribe 2022");
        }

        System.out.print("Introduce tu fecha de nacimiento: ");

        int yearNacimiento = sc.nextInt();

        System.out.println("Tu edad de nacimiento en base a tu año es: " + (yearInput - yearNacimiento));

        sc.close();
    }
}
