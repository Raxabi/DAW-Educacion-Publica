import java.util.Scanner;

public class Ejercicio15 {
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

        if (primerNumero <= segundoNumero && segundoNumero <= tercerNumero) {
            System.out.println(primerNumero + " " + segundoNumero + " " + tercerNumero);
        }

        if (segundoNumero <= primerNumero && primerNumero <= tercerNumero) {
            System.out.println(segundoNumero + " " + primerNumero + " " + tercerNumero);
        }

        if (tercerNumero <= primerNumero && primerNumero <= segundoNumero) {
            System.out.println(tercerNumero + " " + primerNumero + " " + segundoNumero);
        }

        if (primerNumero >= segundoNumero && segundoNumero >= tercerNumero) {
            System.out.println(tercerNumero + " " + segundoNumero + " " + primerNumero);
        }

        if (tercerNumero >= primerNumero && primerNumero >= segundoNumero) {
            System.out.println(tercerNumero + " " + primerNumero + " " + segundoNumero);
        }

        if (segundoNumero >= tercerNumero && tercerNumero >= primerNumero) {
            System.out.println(primerNumero + " " + tercerNumero + " " + segundoNumero);
        }
    }
}
