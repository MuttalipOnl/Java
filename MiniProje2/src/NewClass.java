
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Aracınız Kilometrede kaç kuruş yakıyor?(Örnerk: 0,32)= ");
        double kurus = scanner.nextDouble();
        System.out.print("Aracanızla kaç kilometre gittiniz= ");
        int km = scanner.nextInt();
        System.out.print("Toplam Ödemeniz Gerekn Tutar= "+ (km*kurus)+" tl dir..");
        
}
}
