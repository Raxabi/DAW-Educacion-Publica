import java.util.Scanner;

public class Ejercicio12 {
    private static void print(Object message) {
        System.out.print(message);
    }
    public static void main(String[] args) {
        
        // Escaneamos los datos
        Scanner sc = new Scanner(System.in);
        print("Introduce tus ganancias por horas: ");

        int horasGanancias = sc.nextInt();
        print("Introduce cuantas horas trabajas: ");

        int horasTrabajas = sc.nextInt();

        sc.close();

        // Calculamos los impuestos
        int gananciaBruto = horasGanancias * horasTrabajas;
        int restaSS = gananciaBruto * 4 / 100;
        int restaIRPF = gananciaBruto * 7 / 100;

        print("Se te restara de su sueldo bruto de: " + gananciaBruto + " un total del " + restaIRPF + restaSS + "$");
        int gananciaNeto = gananciaBruto - restaSS - restaIRPF;

        print("\nTu sueldo semanal es de " + (gananciaNeto * 5));
    }
}