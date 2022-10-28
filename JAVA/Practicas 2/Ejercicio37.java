import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {

        int cantidadPositivos = 0, cantidadNegativos = 0;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una serie de numeros: ");

        int numeroSiguiente = sc.nextInt();

        do {

            if (numeroSiguiente > 0) {
                cantidadPositivos = cantidadPositivos + 1;
            };

            if (numeroSiguiente < 0) {
                cantidadNegativos = cantidadNegativos + 1;
            }

            numeroSiguiente = sc.nextInt();

            if (numeroSiguiente == 0) {
                sc.close();
                System.out.println("Cantidad positivos: " + cantidadPositivos);
                System.out.println("Cantidad negativos: " + cantidadNegativos);
                return;
            }
        } while (sc.hasNextLine());
        sc.close();
    }
}
