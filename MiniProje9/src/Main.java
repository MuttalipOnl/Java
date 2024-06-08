
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int hak = 3;
        
        String kadi = "Muti";
        String ksifre = "1";
        
        System.out.println("**********************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("**********************");
        
        while (true) {            
            System.out.print("Kullanıcı Adı : ");
            String kullanıcı = scanner.nextLine();
            System.out.print("Parola : ");
            String sifre = scanner.nextLine();
            
            if (kullanıcı.equals(kadi ) && sifre.equals(ksifre)) {
                System.out.println("Giriş Başarılı...");
                break;
            }else if (kullanıcı.equals(kadi) && !sifre.equals(ksifre)) {
                System.out.println("Şifre Hatalı");
                hak -= 1;
                System.out.println("Kalan Hak : " + hak);
            }else if (!kullanıcı.equals(kadi ) && sifre.equals(ksifre)) {
                System.out.println("Kullanıcı Adı Hatalı\n");
                hak -= 1;
                System.out.println("Kalan Hak : " + hak + "\n");
            }  else{
                System.out.println("Kullanıcı Adı ve Şİfre Hatalı...\n");
                hak -= 1;
                System.out.println("Kalan Hak : " + hak + "\n");
            }
            if (hak == 0) {
                System.out.println("Hakkınız Bitti...");
                break;
            }
        }
    }
}
