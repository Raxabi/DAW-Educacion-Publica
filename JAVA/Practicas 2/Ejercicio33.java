import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {

        int base, exponente;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduce la base de la potencia: ");
            base = sc.nextInt();

            System.out.print("Introduce el exponente de la pontecia: ");
            exponente = sc.nextInt();
        }

        for (int i = 0; i <= exponente; i++) {
            System.out.println(base + "^" + i + " = " + (int)Math.pow(base, i));
        }
    }
}
