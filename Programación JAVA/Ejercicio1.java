import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        // declaramos la variable sin asignarle un valor inicial
        int edad;

        // Creamos una instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);

        // Pedimos la edad
        System.out.print("Introduce tu edad: ");

        // Recogemos el input de la ejecucion del programa
        int userinput = sc.nextInt();

        // Reasignamos la variable
        edad = userinput;

        // Enseñamos el input del usuario y la edad que tendra el proximo año
        System.out.print("Tu edad actual es de " + edad + " años. El año que viene tendras " + (edad + 1) + " años, felicidades adelantadas :D");

        // `cerramos` el objecto sc
        sc.close();

    }
}