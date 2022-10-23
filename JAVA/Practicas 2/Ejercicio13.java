import java.util.Scanner;

public class Ejercicio13 {
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

        System.out.println("Cuadrado del primero numero: " + (Math.pow(primerNumero, 2)));
        System.out.println("Cubo del segundo numero: " + (Math.pow(segundoNumero, 3)));
        System.out.println("Raiz cuadrada del terce numero: " + (Math.sqrt(tercerNumero)));
    }
}
