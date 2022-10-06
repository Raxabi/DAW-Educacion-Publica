public class Ejercicio8b {
    private static void print(Object message) {
        System.out.print(message);
    }
    public static void main(String[] args) {
        int primerNumero = Integer.parseInt(args[0]);
        int segundoNumero = Integer.parseInt(args[1]);

        if (primerNumero == 7 && segundoNumero == 11) {
            print("Numeros correctos");
        } else print("Numeros introducidos no correctos");
    }
}