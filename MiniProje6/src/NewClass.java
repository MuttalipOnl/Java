
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Hesap Makinesi
        
        System.out.print("\n1.Sayıyı giriniz: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("2.Sayıyı giriniz: ");
        double sayi2 = scanner.nextDouble();
        
        System.out.print("1- Toplama\n"
                + "2- Çıkarma\n"
                + "3- Çarpma\n"
                + "4- Bölme\n"
                + "İşlem Seçiniz: ");
        int secim = scanner.nextInt();
        
        double top = 0;
        switch(secim){
            case 1:
                top = sayi1 + sayi2;
                System.out.println(sayi1 + " + " + sayi2 + " = " + top);
                break;
            case 2:
                top = sayi1 - sayi2;
                System.out.println(sayi1 + " - " + sayi2 + " = " + top);
                break;
            case 3:
                top = sayi1 * sayi2;
                System.out.println(sayi1 + " * " + sayi2 + " = " + top);
                break;
            case 4:
                top = sayi1 / sayi2;
                System.out.println(sayi1 + " / " + sayi2 + " = " + top);
                break;
            default:
                System.out.println("Geçersiz İşlem Lütfen 1-4 Arasında Bir Sayı Girin");
                break;
        }
        
        
    }
}
