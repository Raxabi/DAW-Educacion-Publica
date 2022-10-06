import java.util.Scanner;

public class Ejercicio15 {
    private static void print(Object message) {
        System.out.print(message);
    }

    private static float surface(float base, float heigth) {
        float surface = base * heigth / 2;
        return surface;
    }
    public static void main(String[] args) {
        float base, altura;
        try (Scanner sc = new Scanner(System.in)) {
            print("Introduce la base de la superficie: ");
            base = sc.nextFloat();
            print("Introduce la altura de la superficie: ");
            altura = sc.nextFloat();
        }

        System.out.println("\nLa superficie es: " + surface(base, altura));
    }
}