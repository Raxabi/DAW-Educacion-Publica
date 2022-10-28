public class Ejercicio34 {

    private static void fibo(int numero) {
        if (numero == 0 || numero == 1) {
            throw new Error("El numero de la sucesion no puede emepzar por 0 o 1");
        }

        int numeroActual = 2, numeroSiguiente = 0;

        for (int i = 2; i < numero; i++) {
            numeroActual = i;
            System.out.println(numeroActual);
        }
    }
    public static void main(String[] args) {
        fibo(20);
    }
}