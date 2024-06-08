public class Main {
    public static void main(String[] args) {
        // değişkenlerin başına sayı eklenemez (2muti)
        int a = 12;
        a = 8;
        int b = 4+9;
        int c = a+b;
        System.out.print(a + " + ");
        System.out.print(b + " = ");
        System.out.print(c + "\n\n"); 
        
        // ******************************************************
        
        int i = 4; //-2 ^ 31 - 2 ^ 31 - 1
        System.out.println("İnt Min " + Integer.MIN_VALUE);
        System.out.println("İnt Max " + Integer.MAX_VALUE);
        byte x = 100;
        System.out.println("Byte Min " + Byte.MIN_VALUE);
        System.out.println("Byte Max " + Byte.MAX_VALUE);
        short z = 200;
        System.out.println("Short Min " + Short.MIN_VALUE);
        System.out.println("Short Max " + Short.MAX_VALUE);
        long y = 500;
        System.out.println("Long Min " + Long.MIN_VALUE);
        System.out.println("Long Max " + Long.MAX_VALUE);
        
        // byte --> short --> int --> long
        
        short j = 1000;
        int d = (j / 2);
        int k = j;
        
        byte e = 100;
        // byte l = (e / 2);  (e/2) int olduğu için byte dönüştüremiyor
        byte l = (byte)(e / 2);  
        // Otomatik dönüştürmediğinde bu şekilde dönüştürebiliriz
        System.out.println(l);
        
        // int --> float --> double
        // Doubel : 64 bit - 8 byte
        // Float : 32 bit - 4 byte
        
        double r = 5.25;
        double t = 4.0;
        double u = 4d; // 4.0
        float ı = (float)5.0;
        float o = 5f;
        
        int p = 22 / 7;
        float s = 22f / 7f;
        double f = 22d / 7d;
        
        System.out.println("p: " + p);        
        System.out.println("s: " + s);        
        System.out.println("f: " + f);        
        
        // Char - Boolean
        
        char h = 'H';
        char g = '?';
        char v = 2000;
        System.out.println(v);
        
        boolean n = true;
        boolean m = false;
        
        // String veri tipi
        
        String a2 = "Merhaba";
        String a3 = " Hoşgeldiniz...";
        
        String toplam = a2 + a3;
        System.out.println(toplam);


    }
}
