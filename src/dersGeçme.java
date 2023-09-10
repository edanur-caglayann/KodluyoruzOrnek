import java.util.Scanner;

public class dersGeçme {
    public static void main(String[]args){
    /*
    Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
    Geçme Notu : 55
     */

        int mat,fizik, turkce,kimya, muzik;
        double dersOrtalamasi;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz:");
        mat = scanner.nextInt();

        System.out.println("Fizik notunuzu giriniz:");
        fizik = scanner.nextInt();

        System.out.println("Türkçe notunuzu giriniz:");
        turkce = scanner.nextInt();

        System.out.println("Kimya notunuzu giriniz:");
        kimya = scanner.nextInt();

        System.out.println("Müzik notunuzu giriniz:");
        muzik = scanner.nextInt();

        dersOrtalamasi = (double) (mat+fizik+ turkce +kimya+ muzik)/5;
        System.out.println("Ders Ortalaması:" +dersOrtalamasi);

        if(dersOrtalamasi>=55){
            System.out.println("Geçtiniz");
        }

        else{
            System.out.println("Kaldınız");
        }
    }


}
