import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int codigo;
        HashMap<Integer, String> dict = new HashMap<Integer, String>();
        Scanner sc = new Scanner(System.in);

        dict.put(2548, "Cuenca");

        System.out.print("Introduce un codigo valido de 4 digitos: ");
        codigo = sc.nextInt();

        sc.close();

        String intLenght = Integer.toString(codigo);

        if (intLenght.length() == 4) {
            System.out.println("La provincia es: " +  dict.get(codigo));
        } else {
            throw new Error("ERROR: Codigo no valido, debe de ser de 4 digitos");
        }
    }
}
