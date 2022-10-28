import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {

        int x = 5;

        char selection;
        int inputNumber;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Menu de operaciones");
            System.out.println("-------------------");
            System.out.println("F: Calcula el factorial");
            System.out.println("R: Calcula la raiz cuadrada");
            System.out.println("C: Calcula el cuadrado");
            System.out.println("T: Finalizara el algoritmo");
            System.out.println("-------------------");

            System.out.print("Introduzca una opcion (F/R/C/T): ");
            selection = sc.next().charAt(0);
            selection = Character.toUpperCase(selection);

            switch (selection) {
                case 'F' -> {
                    sc.nextLine();
                    System.out.print("Introduzca el numero con el que va a elaborar las operaciones: ");
                    inputNumber = sc.nextInt();
                    int accumulator = 1;
                    System.out.println("Calculando el factorial...");
                    for (int i = 1; i <= inputNumber; i++) {
                        accumulator *= i;
                    }
                    System.out.println("\nEl factorial de " + inputNumber + " es " + accumulator + "\n");
                }
                case 'R' -> {
                    System.out.print("Introduzca el numero con el que va a elaborar las operaciones: ");
                    inputNumber = sc.nextInt();
                    System.out.println("\nLa raiz cuadrada de " + inputNumber + " es " + (Math.sqrt(inputNumber)) + " \n");
                }
                case 'C' -> {
                    System.out.print("Introduzca el numero con el que va a elaborar las operaciones: ");
                    inputNumber = sc.nextInt();
                    System.out.println("\n La cuadrado de " + inputNumber + " es " + (Math.pow(inputNumber, 2)) + "\n");
                }
                case 'T' -> {
                    sc.close();
                    x = 4;
                }
            }

        } while (x == 5);
    }
}