public class FibonacciArray {
    public static void main(String[] args) {
        
        long numeroActual = 0, numeroSiguiente = 2;

        for (long i = 2; i <= 20; i++) {
            System.out.print(numeroSiguiente + ", ");
            numeroActual = i;
            numeroSiguiente = (numeroActual - 1) + (numeroActual - 2);
        }

    }
}
