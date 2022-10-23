import java.util.Locale;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Introduce un numer decimal: ");
        float decimalNum = sc.nextFloat();

        float num = -0.99f;

        System.out.println(Math.abs(num));

        sc.close();
    }
}
