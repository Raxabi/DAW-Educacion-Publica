// Este lo hice antes pero no sabia que no se podian utilizar bucles
public class Ejercicio8bForLoop {
    private static void print(Object message) {
        System.out.print(message);
    }
    public static void main(String[] args) {
        int[] numericArgs = new int[2];
        for (int i = 0; i < args.length; i++) {
            numericArgs[i] = Integer.parseInt(args[i]);
        }
        if (numericArgs[0] == 7 && numericArgs[1] == 11) {
            print("Numeros correctos");
        } else print("Numeros introducidos no correctos");
    }
}