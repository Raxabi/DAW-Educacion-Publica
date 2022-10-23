import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        final int primerNumero = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        final int segundoNumero = sc.nextInt();

        sc.close();

        int resultado = 0, cantidadPar = 0;

        for (int i = primerNumero; i <= segundoNumero; i++) {

            if (i % 2 == 0) {
                resultado += i;
                cantidadPar += 1;
            }
        }
        System.out.println("\nSe han contado " + cantidadPar + " números y suman " + resultado);

    }
}
