package operadoresrelacionales;
import java.util.Scanner;

public class Prog1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer el número de casos de prueba
        int t = scanner.nextInt();
        
        // Procesar cada caso
        for (int i = 0; i < t; i++) {
            // Leer los dos números
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            
            // Determinar la relación
            if (a > b) {
                System.out.println(">");
            } else if (a < b) {
                System.out.println("<");
            } else {
                System.out.println("=");
            }
        }
        
        scanner.close();
    }
}
