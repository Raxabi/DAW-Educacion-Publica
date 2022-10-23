import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        short num1 = sc.nextShort();

        System.out.print("Introduce otro numero: ");
        short num2 = sc.nextShort();

        sc.close();

        if (num1 % num2 == 0) {
            System.out.println("La division del numero " + num1 + " y " + num2 + " es entera");
        } else if (num1 % num2 == 0) {
            System.out.println("La division del numero " + num1 + " y " + num2 + " no es entera");
        }
    }
}
