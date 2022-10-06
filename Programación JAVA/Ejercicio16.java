public class Ejercicio16 {
    public static void main(String[] args) {
        int u = 80;
        int v = 90;
        System.out.println("u " + u +  " v " + v);

        // Usamos el valor de asignacion XOR
        u ^= v;
        v ^= u;
        u ^= v;

        System.out.println("u " + u + " v " + v);
    }
}
