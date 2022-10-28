public class RecursiveFibonacci {
    private static long fibonacci(int numero) {
        if (numero < 2) return (long)numero;

        return fibonacci(numero - 1) + fibonacci(numero - 2);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(20));
    }
}
