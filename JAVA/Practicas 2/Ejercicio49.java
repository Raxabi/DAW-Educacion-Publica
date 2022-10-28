import java.util.Scanner;
import java.lang.Thread;

public class Ejercicio49 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Desea poner el reloj en hora (S/N)?: ");
        char selection = sc.next().charAt(0);
        selection = Character.toUpperCase(selection);
        sc.nextLine();
        short hora, minutos, segundos;
        switch (selection) {
            case 'S' -> {
                System.out.println("Hora: ");
                hora = sc.nextShort();

                System.out.println("Hora: ");
                minutos = sc.nextShort();

                System.out.println("Hora: ");
                segundos = sc.nextShort();
                sc.close();

                do {
                    try {
                        System.out.printf("%02d:%02d:%02d%n", hora, minutos, segundos);
                        Thread.sleep(1000);
                        segundos += 1;
                        if (segundos > 59) {
                            minutos += 1;
                            segundos = 0;
                        }

                        if (minutos > 59) {
                            hora += 1;
                            minutos = 0;
                        }

                        if (hora > 24 && minutos > 59 && segundos > 59) {
                            hora = 0;
                            minutos = 0;
                            segundos = 0;
                        };
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                } while (true);
            }
            case 'N' -> {
                segundos = 00;
                minutos = 00;
                hora = 00;
                do {
                    try {
                        System.out.printf("%02d:%02d:%02d%n", hora, minutos, segundos);
                        Thread.sleep(1000);
                        segundos += 1;
                        if (segundos > 59) {
                            minutos += 1;
                            segundos = 0;
                        }

                        if (minutos > 59) {
                            hora += 1;
                            minutos = 0;
                        }

                        if (hora > 24 && minutos > 59 && segundos > 59) {
                            hora = 0;
                            minutos = 0;
                            segundos = 0;
                        };
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                } while (true);
            }
        }
        sc.close();
    }
}