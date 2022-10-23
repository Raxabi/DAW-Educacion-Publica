import java.util.Scanner;

public class Ejercicio12 {
    private static void print(Object message) {
        System.out.print(message);
    }
    public static void main(String[] args) {
        int numero1, numero2;
        int x = 5;
        char selection;

        do {
            Scanner sc = new Scanner(System.in);
            print("Que operacion quieres realizar?\n");
            print("+. Para sumar\n");
            print("-. Para restar\n");
            print("*. Para multiplicar\n");
            print("/. Para dividir\n");
            selection = sc.next().charAt(0);
            sc.nextLine();

            print("Introduce el primer numero: ");
            numero1 = sc.nextInt();
            print("Introduce el segundo numero: ");
            numero2 = sc.nextInt();
            sc.nextLine();
            switch (selection) {
                case '+' -> {
                    print((numero1 + numero2) + "\n");
                    print("Quieres calcular otra cifra?\n");
                    print("'s' para si o 'n' para no: ");
                    selection = sc.next().charAt(0);
                    if(selection != 's') {
                        x = 4;
                        sc.close();
                    }
                }

                case '-' -> {
                    print((numero1 - numero2) + "\n");
                    print("Quieres calcular otra cifra?\n");
                    print("'s' para si o 'n' para no: ");
                    selection = sc.next().charAt(0);
                    if(selection != 's') {
                        x = 4;
                        sc.close();
                    }
                }

                case '*' -> {
                    print((numero1 * numero2) + "\n");
                    print("Quieres calcular otra cifra?\n");
                    print("'s' para si o 'n' para no: ");
                    selection = sc.next().charAt(0);
                    if(selection != 's') {
                        x = 4;
                        sc.close();
                    }
                }

                case '/' -> {
                    if (numero2 == 0) {
                        sc.close();
                        throw new Error("Se puede dividir por 0, pero estamos en una fp no en un doctorado");
                    }
                    print((numero1 / numero2) + "\n");
                    print("Quieres calcular otra cifra?\n");
                    print("'s' para si o 'n' para no: ");
                    selection = sc.next().charAt(0);
                    if(selection != 's') {
                        x = 4;
                        sc.close();
                    }
                }
            }
        } while (x == 5);
    }
}
