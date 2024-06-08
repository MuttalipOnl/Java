
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println("Lütfen Yaşınızı Giriniz: ");
        int yas = scanner.nextInt();
        
        if (yas < 18){
            System.out.println("Buraya Giremezsiniz...");   
        }
        else{
            System.out.println("Hoşgeldniz...");
        }
        */
        
        System.out.print("Lütfen Notunuzu Giriniz: ");
        int not = scanner.nextInt();
        
        if (not >= 90) {
            System.out.println("Notunuz: AA");
        }
        else if (not >= 80) {
            System.out.println("Notunuz: BA");
        }
        else if (not >= 70) {
            System.out.println("Notunuz: BB");
        }
        else if (not >= 60) {
            System.out.println("Notunuz: CB");
        }
        else if (not >= 50) {
            System.out.println("Notunuz: CC");
        }
        else if (not >= 45) {  
            System.out.println("Notunuz: DC");
        }
        else if (not >= 40) {  
            System.out.println("Notunuz: DD");
        }
        else{
            System.out.println("Dersten Kaldınız");
        }
        
    }
}
