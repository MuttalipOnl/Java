
import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Sayı girniz= ");
        int sayı = scanner.nextInt();
        System.out.println("Sayı= " + sayı);

        int yass = scanner.nextInt();
        scanner.nextLine(); // Dummy
        
        String isim = scanner.nextLine();
        
        System.out.println("Yaşınız: " + yass);
        System.out.println("İsminiz: " + isim);
        

    }
}
