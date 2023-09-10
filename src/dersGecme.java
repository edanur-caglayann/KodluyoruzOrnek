import java.util.Scanner;

public class dersGecme {
    public static void main(String[]args){
    /*
    Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
    Geçme Notu : 55
    Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
     */

        int mat,fizik, turkce,kimya, muzik;
        double dersOrtalamasi;
        int gecerliDersSayisi =0;
        int toplam=0;

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

        if(0<= mat && mat <= 100){
            toplam+=mat;
            gecerliDersSayisi+=1;
        }

        if(0 <= fizik && fizik <= 100){
            toplam+=fizik;
            gecerliDersSayisi+=1;
        }

        if(0 <= turkce && turkce <= 100){
            toplam+= turkce;
            gecerliDersSayisi+=1;
        }


        if(0 <= kimya && kimya <= 100){
            toplam+=kimya;
            gecerliDersSayisi+=1;
        }

        if(0 <= muzik && muzik <= 100){

            toplam+= muzik;
            gecerliDersSayisi+=1;
        }

        if(gecerliDersSayisi == 0 || toplam ==0){
            System.out.println("Ortalama hesaplanamaz. ");
            System.exit(0);
        }
        else{

            dersOrtalamasi =  (double) toplam / gecerliDersSayisi;
            System.out.println("Ders Ortalaması:" + dersOrtalamasi);
            if(dersOrtalamasi>=55){
                System.out.println("Geçtiniz");
            }

            else{
                System.out.println("Kaldınız");
            }
        }
    }

}
