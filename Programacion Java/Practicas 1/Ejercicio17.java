import java.math.BigDecimal;
import java.util.Scanner;

public class Ejercicio17 {
    private static BigDecimal calc(float a, float b, float c, float d) {        
        BigDecimal firstCalc = Math.pow(a, b) + Math.pow(b, d);
        BigDecimal secCalc = Math.pow(a, c) + Math.pow(b, d);
        BigDecimal result = firstCalc.multiply(secCalc);
        return result;
    }

    private static void print(Object message) {
        System.out.print(message);
    }

    public static void main(String[] args) {
        float a, b, c, d;
        try (Scanner sc = new Scanner(System.in)) {
            print("Introduce el primer numero: ");
            a = sc.nextFloat();
            print("Introduce el segundo numero: ");
            b = sc.nextFloat();
            print("Introduce el tercer numero: ");
            c = sc.nextFloat();
            print("Introduce el cuarto numero: ");
            d = sc.nextFloat();
        }

        System.out.println(calc(a, b, c, d));
    }
}