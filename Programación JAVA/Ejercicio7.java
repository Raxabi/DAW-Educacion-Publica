import java.util.Scanner;

public class Ejercicio7 {

    private static void println(Object message) {
        System.out.println(message);
    }

    private static void print(Object message) {
        System.out.print(message);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double kiloNaranjas = 1.25;
        double kiloLimones = 1.90;

        print("Introduce las ventas de naranjas de este semestre en kilos: ");
        int ventasNaranjas = sc.nextInt();

        print("Introduce las ventas de limones de este semestre en kilos: ");
        int ventasLimones = sc.nextInt();

        println("\nGanancias por los limones este semestre: " + (ventasNaranjas * kiloNaranjas));
        println("Ganancias por los limones este semestre: " + (ventasLimones * kiloLimones));

        sc.close();
    }
}
