public class Ejercicio18 {
    // Suponiendo que el valor de m es 20
    // el valor de n es 30
    // el valor de k es de 10
    public static void main(String[] args) {
        int tester = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 30; j++) {
                System.out.println("Hello World! " + (tester += 1));
                for (int j2 = 0; j2 < 10; j2++) {
                    //System.out.println("Hello World!" + (tester += 1));
                }
            }
        }
    // El ultimo se ejecutara un total de 6000 veces
    }
}
