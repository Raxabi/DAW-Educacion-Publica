import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        short num1 = sc.nextShort();

        System.out.print("Introduce otro numero: ");
        short num2 = sc.nextShort();

        sc.close();

        if (num1 > num2) {
            System.out.println("El numero " + num1 + " Es mayor que el numero " + num2);
        } else if (num1 == num2) {
            System.out.println("Los numeros son iguales");
        }
    }
}
