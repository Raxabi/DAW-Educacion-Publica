import java.util.Scanner;

public class Ejercicio34 {

    public static void main(String[] args) {

        long numeroTope, numeroSiguiente = 1, numeroActual = 0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduzca un numero limite: ");
            numeroTope = sc.nextLong();
        }

        for (long i = 1; i <= numeroTope; i++) {
            System.out.print(numeroSiguiente + ", ");
            numeroActual = numeroSiguiente;
            numeroSiguiente = numeroSiguiente + numeroActual;
        }
        System.out.println(numeroActual);
    }
}