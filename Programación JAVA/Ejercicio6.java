import java.util.Scanner;

public class Ejercicio6 {

    // Creamos metodo para facilitar el print
    private static void print(Object message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdduce tu edad: ");

        int inputYear = sc.nextInt();

        sc.close();

        print(inputYear >= 18 ? "Eres mayor de edad" : "Eres menor de edad");
    }
}