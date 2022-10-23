import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        short input1, input2, input3;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Introduce un numero: ");
            input1 = sc.nextShort();

            System.out.print("Introduce un numero: ");
            input2 = sc.nextShort();

            System.out.print("Introduce un numero: ");
            input3 = sc.nextShort();

        }

        if(input1 > input2 && input1 > input3) {
            System.out.print("El numero " + input1 + " es mayor");
        }

        if(input2 > input1 && input2 > input3) {
            System.out.print("El numero " + input2 + " es mayor");
        }

        if(input3 > input1 && input3 > input2) {
            System.out.print("El numero " + input3 + " es mayor");
        }
    }
}
