
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Boyunuz Giriniz(1,75): ");
        double boy = scanner.nextDouble();
        System.out.print("Kilonuzu Giriniz: ");
        int kilo = scanner.nextInt();
        double index = kilo / (boy * boy);
        System.out.println("Beden Kitle İndex'in: " + index);
        if (index >= 30) {
            System.out.println("Obezsin");
        }
        else if (index >= 25 && index < 30) {
            System.out.println("Fazla Kilolsun");
        }
        else if (index >= 18.5 && index < 25) {
            System.out.println("Normalsin");
        }
        else if (index < 18.5) {
            System.out.println("Zayıfsın");
        }
        
}
}
