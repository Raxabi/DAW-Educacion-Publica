import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        int num1, positivo = 0, negativo = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        num1=sc.nextInt();

        while(num1 != 0) {
            if(num1 > 0) {
                positivo = positivo + 1;
            }

            if(num1 < 0) {
               negativo = negativo + 1;
            }
            
            System.out.println("Introduce un número: ");
            num1 = sc.nextInt();
        }
        System.out.println(positivo);
        System.out.println(negativo);

        sc.close();
    }
}