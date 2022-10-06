public class Ejercicio4 {
    // Definimos un nuevo metodo para facilitarnos el print de java
    private static void print(Object message) {
        System.out.println(message);
    }
    public static void main(String[] args) {

        if (args.length > 1) throw new Error("No puedes dar mas de un argumento para este ejemplo.");

        // Convertimos el primer argumento dado a args a un numero entero
        double radio = Double.parseDouble(args[0]);

        double pi = 3.14;

        double longitud = 2 * pi * radio;

        double area = pi * Math.pow(radio, 2);

        print("Longitud = " + longitud);
        print("Area = " + area);
    }
}