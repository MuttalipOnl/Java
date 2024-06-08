
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilonuz Girin= ");
        int kilo = scanner.nextInt();
        System.out.print("Boyunuz Girin(Örnek: 1,72)= ");
        double boy = scanner.nextDouble();
        
        double bki = kilo / boy * boy;
        System.out.println("Beden Kitle İndexsiniz= " + bki);
    }
    
}
