import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        String[] inputCount;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce los numeros separados por espacios: ");
        inputCount = sc.nextLine().split(" ");
        sc.close();
        float[] floatCount = new float[inputCount.length];
        int sum = 0;
        for (int i = 0; i < inputCount.length; i++) {
            floatCount[i] = Integer.parseInt(inputCount[i]);
            for (float f : floatCount) {
                System.out.println(f);
            }
        }
    }
}