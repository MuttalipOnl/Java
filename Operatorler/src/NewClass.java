
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        /*
        Karşılaştırma Operatörleri
        
        == --> Eşit mi?
        != --> Eşit Değil mi?
        > ---> Büyük mü?
        >= --> Büyük veya Eşit mi?
        < ---> Küçük mü?
        <= --> Küçük veya Eşit mi?
        
        */
        
        Scanner scanner = new Scanner(System.in);
        System.out.println(3 == 3);
        System.out.println(3 != 4);
        System.out.println(2 > 1);
        System.out.println(2 >= 3);
        System.out.println(3 < 1);
        System.out.println(3 <= 2);
        System.out.println("Muti" == "Muti");
        System.out.println("");
        /*
        Mantıksal Operatörler
        
        && ---> And Operatörü
        || ---> Or Operatörü
        !  ---> Not Operatörü
        
        */
        
        System.out.println(3 == 3 && 2 > 3);
        System.out.println(3 != 3 || 2 < 3);
        System.out.println(!(3 < 4));
    }
}
