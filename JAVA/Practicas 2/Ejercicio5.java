import java.util.Scanner;

public class Ejercicio5 {
    private static String check(byte pointoJointo) {
        if(pointoJointo < 60) return "E";
        else if(pointoJointo == 60 || pointoJointo == 69) return "D";
        else if(pointoJointo == 70 || pointoJointo == 79) return "C";
        else if(pointoJointo < 80 || pointoJointo == 89) return "B";
        else if(pointoJointo == 90 || pointoJointo > 90) return "A";
        return "Ningun resultado coincide";
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            byte points;
            System.out.print("Introduce los puntos: ");
            points = sc.nextByte();
            System.out.println(check(points));
        }
    }
}
