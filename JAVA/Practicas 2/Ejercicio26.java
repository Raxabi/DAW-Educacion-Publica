import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero delimitador: ");
        final int numero = sc.nextInt();
        sc.close();

        for (int i = 1; i < numero; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
