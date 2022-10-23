import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        final int primerNumero = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        final int segundoNumero = sc.nextInt();

        int resultado = 0;

        sc.close();

        if (!(primerNumero > segundoNumero)) {
            for (int i = primerNumero; i <= segundoNumero; i++) {
                resultado += i;
            }
            System.out.println(resultado);
        }
    }
}
