
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Kullanıcıdan Alınan 3 Sayıdan En Büyük Sayıyı Bulma
        System.out.print("1.Sayıyı Giriniz:");
        int s1 = scanner.nextInt();
        System.out.print("2.Sayıyı Giriniz:");
        int s2 = scanner.nextInt();
        System.out.print("3.Sayıyı Giriniz:");
        int s3 = scanner.nextInt();
        
        if (s1 > s2 && s1 > s3) {
            System.out.println("En Büyük Sayı: " + s1);
        }
        else if (s2 > s1 && s2 > s3) {
            System.out.println("En Büyük Sayı: " + s2);
        }
        else{
            System.out.println("En Büyük Sayı: " + s3);
        }
        
}
}
