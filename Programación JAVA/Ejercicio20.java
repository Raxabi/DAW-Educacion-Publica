import java.util.Scanner;

public class Ejercicio20 {
    private static void print(Object message) {
        System.out.print(message);
    }
    public static void main(String[] args) {
        int patasHomigas, patasSpiders, patasCochinillas;
        final int nPatasHormigas = 6;
        final int nPatasSpiders = 8;
        final int nPatasCochinillas = 14;

        try (Scanner sc = new Scanner(System.in)) {
            print("\nIntroduce el numero de hormigas: ");
            patasHomigas = sc.nextInt();
            print("\nIntroduce el numero de Arañas: ");
            patasSpiders = sc.nextInt();
            print("\nIntroduce el numero de Cochinillas: ");
            patasCochinillas = sc.nextInt();
        }

        print("\nNumero de patas totales de hormigas: " + (patasHomigas * nPatasHormigas));
        print("\nNumero de patas totales de arañas: " + (patasSpiders * nPatasSpiders));
        print("\nNumero de patas totales de cochinillas: " + (patasCochinillas * nPatasCochinillas));
    }
}
