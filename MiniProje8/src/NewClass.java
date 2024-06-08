
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "1.İşlem : Bakiye Öğrenme\n"
                + "2.İşlem : Para Çekme\n"
                + "3.İşlem : Para Yatırma\n"
                + "Çıkış İçin q'a Basın\n";
        
        System.out.println("**************************");
        System.out.println(islemler);
        System.out.println("**************************");
        double bakiye = 15;
        
        while (true) {   
            System.out.print("İşleminiz: ");
            String islem = scanner.nextLine();
            
            if (islem.equals("1")) {
                System.out.println(bakiye + "tl");
                
            }
            else if (islem.equals("2")) {
                System.out.print("Ne Kadar Para çekmek istiyorsunuz: ");
                int para = scanner.nextInt();
                scanner.nextLine();
                
                if (bakiye - para < 0) {
                    System.out.println("Bu kadar Bakiyeniz Yok. Bakiyeniz: " + bakiye + "tl");
                }else{
                    bakiye -= para;
                    System.out.println(para + "tl çekildi yeni bakiyeniz: " + bakiye + "tl");
                }
                
            }
            else if (islem.equals("3")) {
                System.out.print("Ne Kadar Para yatırmak istiyorsunuz: ");
                int para = scanner.nextInt();
                scanner.nextLine();
                bakiye += para;
                System.out.println(para + "tl yatırıldı yeni bakiyeniz: " + bakiye + "tl");
            }
            else if (islem.equals("q")) {
                System.out.println("Çıkış Yapıldı");
                break;
            }else{
                System.out.println("Geçersiz İŞlem....");
            }
        }
        
        
}
}
