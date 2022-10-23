import java.util.Scanner;

import javax.print.event.PrintEvent;

public class Ejercicio14 {
    public static void main(String[] args) {
        int primerNumero, segundoNumero, tercerNumero;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduce el primer numero: ");
            primerNumero = sc.nextInt();

            System.out.print("Introduce el segundo numero: ");
            segundoNumero = sc.nextInt();

            System.out.print("Introduce el tercer numero: ");
            tercerNumero = sc.nextInt();
        }

        if (primerNumero < segundoNumero + tercerNumero) {
            System.out.println("No es un triangulo");
        }

        if (Math.pow(primerNumero, 2) == Math.pow(segundoNumero, 2) + Math.pow(segundoNumero, 2)) {
            System.out.println("Es un triangulo rectangulo");
        }

        if (Math.pow(primerNumero, 2) > Math.pow(segundoNumero, 2) + Math.pow(segundoNumero, 2)) {
            System.out.println("Es un triangulo obtusangulo");
        }

        if (Math.pow(primerNumero, 2) < Math.pow(segundoNumero, 2) + Math.pow(segundoNumero, 2)) {
            System.out.println("Es un triangulo acutangulo");
        }

    }
}
