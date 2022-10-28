import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int accummulator, mayoresDeEdad = 0, menoresDeEdad = 0, mediaContador = 0, mediaCantidad = 0;
        short x = 5;

        do {
            System.out.print("Edad: ");
            accummulator = sc.nextInt();

            if (accummulator <= 0) {
                x = 4;
            }

            if (accummulator < 18 && !(accummulator == 0)) {
                menoresDeEdad++;
                mediaContador++;
                mediaCantidad += accummulator;
            }

            if (accummulator > 18) {
                mayoresDeEdad++;
                mediaContador++;
            }

        } while (sc.hasNextLine() && x == 5);
        
        sc.close();
        System.out.println("Numero de alumnos mayores de edad: " + mayoresDeEdad + " alumnos ");
        System.out.println("Numero de alumnos menores de edad: " + menoresDeEdad + " alumnos ");
    }
}