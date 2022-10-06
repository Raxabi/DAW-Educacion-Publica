import java.util.Scanner;

public class Ejercicio14 {
    private static void print(Object message) {
        System.out.print(message);
    }
    public static void main(String[] args) {
        int primeroNumero, segundoNumero;
        try (Scanner sc = new Scanner(System.in)) {
            print("Introduce el primero numero: ");
            primeroNumero = sc.nextInt();
            print("\nIntroduce el segundo numero: ");
            segundoNumero = sc.nextInt();
        }

        print("\nSuma de los numeros: " + (primeroNumero + segundoNumero));
        print("\nResta de los numeros: " + (primeroNumero - segundoNumero));
        print("\nMultiplicacion de los numeros: " + (primeroNumero * segundoNumero));
        print("\nDivision de los numeros: " + (primeroNumero / segundoNumero));
    }
}
