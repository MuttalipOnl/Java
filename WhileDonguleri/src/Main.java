
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   /*
    while(döngü koşulu){
        Koşul doğru olduğu sürece çalışır
    }
   */
   
   /*
   int i = 10;
        while (i < 100) {            
            System.out.println("i = " + i);
            i += 2;
        }
    */
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir Sayı Girin: ");
        int sayi = scanner.nextInt();
        
        int fak = 1;
        
        while (sayi > 0) {            
            fak *= sayi;
            sayi--;
        }
        System.out.println("Faktoriyel= " + fak);
   
}
}
