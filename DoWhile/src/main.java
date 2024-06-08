
import java.util.Scanner;

public class main {
   public static void main(String[] args) {
       /*
       do{
        Koşul doğru olduğu sürece
        whileden farkı en az 1 kere çalışmasını garanti olması
       }while(koşul);
       */
       
      /* int i = 0;
       do{
           System.out.println("i= " + i);
           i++;
       }while (i < 5);         
       */    
       
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Bir Sayı girin: ");
       int sayi = scanner.nextInt();
       int toplam = 0;
       do {           
           toplam += sayi % 10;
           sayi /= 10;
       } while (sayi > 0);
      
       System.out.println("Rakamları toplamı= " + toplam);
    }
}
