import java.util.Scanner;

public class Ejercicio19 {
    private static void print(Object message) {
        System.out.print(message);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            int inputSegs, horas, min, seg;
            print("Introduce los segundos: ");
            inputSegs = sc.nextInt();

            horas = inputSegs / 3600;

            min = (inputSegs - (3600 * horas)) / 60;

            seg = inputSegs - ((horas * 3600) + (min * 60));
            
            print("La conversion es: " + horas + "h " + min + "m " + seg + "s");
        }
    }
}