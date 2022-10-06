import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int firstNumber = sc.nextInt();
        
        System.out.print("Introduce el segundo numero: ");
        int secondNumber = sc.nextInt();
        
        System.out.print("Introduce el tercer numero: ");
        int thirdNumber = sc.nextInt();
        
        sc.close();

        int sumParams = firstNumber + secondNumber + thirdNumber;

        System.out.println(sumParams / 3);
    }
}