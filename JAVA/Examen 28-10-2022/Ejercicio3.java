import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char typeSelection, conoChocolate, nextSelection;
        short numeroBolas, whileControl = 4;
        float coste = 0f;

        do {
            System.out.print("Tarrina (T) o Cucurucho (C): ");
            typeSelection = sc.next().charAt(0);
            typeSelection = Character.toUpperCase(typeSelection);
            // Limpiamos el buffer de char
            sc.nextLine();
            if (typeSelection == 'C' || typeSelection == 'T') {
                System.out.print("Indique el numero de bolas: ");
                numeroBolas = sc.nextShort();
                // Limpiamos el buffer de short
                sc.nextLine();
                if (numeroBolas == 1) {
                    coste += 2.50f;
                    System.out.println("Coste: " + coste);
                }
                if (numeroBolas == 2) {
                    coste += 3.50f;
                    System.out.println("Coste: " + coste);
                }
                if (numeroBolas == 3) {
                    coste += 4.50f;
                    System.out.println("Coste: " + coste);
                }

                if (numeroBolas > 3) {
                    System.out.println("Numero no valido");
                }

                System.out.print("Desea cono de chocolate (S/N)? ");
                conoChocolate = Character.toUpperCase(sc.next().charAt(0));

                switch (conoChocolate) {
                    case 'S' -> {
                        coste += 0.50;
                        System.out.println("Coste: " + coste);
                        System.out.print("Desea algo mas (S/N)? ");
                        nextSelection = Character.toUpperCase(sc.next().charAt(0));
                        if (nextSelection == 'S') {
                            whileControl = 5;
                        } else if (nextSelection == 'N') {
                            whileControl = 4;
                            System.out.println("Total a pagar: " + coste);
                        };
                    }
                    case 'N' -> {
                        coste += 0.50;
                        System.out.println("Coste: " + coste);
                        System.out.print("Desea algo mas (S/N)? ");
                        nextSelection = Character.toUpperCase(sc.next().charAt(0));
                        if (nextSelection == 'S') {
                            whileControl = 5;
                            System.out.println("Total a pagar: " + coste);
                        } else if (nextSelection == 'N') {
                            whileControl = 4;
                            System.out.println("Total a pagar: " + coste);
                        };
                    }
                }
            } else {
                System.out.println("Por favor, indique de forma correcta que desea");
                whileControl = 5;
            }
        } while (whileControl == 5);
    }
}