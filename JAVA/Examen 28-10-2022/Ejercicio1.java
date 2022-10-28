import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        short horas, minutos, segundos;
        Scanner sc = new Scanner(System.in);

        System.out.print("Hora: ");
        horas = sc.nextShort();
        System.out.print("Minutos: ");
        minutos = sc.nextShort();
        System.out.print("Segundos: ");
        segundos = sc.nextShort();

        sc.close();
        if (horas > 24 || minutos > 59 || segundos > 59) {
            System.out.print("Formato de hora erroneo.\nSaliendo del programa...");
        } else {
            System.out.println("Hora introducida: " + horas + ":" + minutos + ":" + segundos);
            for (int i = 0; i < 5; i++) {
                segundos++;
                if (horas == 24) {
                    horas = 0;
                    minutos = 0;
                    segundos = 0;
                }

                if (segundos == 59) {
                    minutos++;
                }

                if (minutos == 59) {
                    horas++;
                }
                System.out.printf("Hora tras " + i + " segundoos: " + "%02d:%02d:%02d\n", horas, minutos, segundos);
            }
        }
    }
}