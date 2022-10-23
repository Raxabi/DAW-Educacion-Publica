import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduce un número: ");
            final float NUMBER_INPUT = sc.nextFloat();

            if (NUMBER_INPUT >= 0) {
                System.out.println(NUMBER_INPUT + " es mayor o igual que 0");
            } else System.out.println(NUMBER_INPUT + " es menor que 0");
        }
    }
}