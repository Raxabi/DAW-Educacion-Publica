import java.util.Scanner;
 
public class NewEjercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("introduce los numeros introducidos por teclado: ");
        
        do {
            int numeros = sc.nextInt();
            if (numeros == 0) return;
            String numerosLength = Integer.toString(numeros);
            for (int i = 0; i < numerosLength.length() ; i++) {
                
            }
            System.out.println(numeros);
        } while (sc.hasNext());
        sc.close();
    }
}