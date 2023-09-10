import java.util.Scanner;

public class notOrtalamasi {
    public static void main(String[]args){
         /*
        Java ile Matematik, Fizik, Kimya, Türkçe,
        Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan
        alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
        */

        int mat,fizik,kimya,türkçe,tarih,müzik;

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz:");
        mat = sc1.nextInt();

        System.out.println("Fizik Notunuzu Giriniz:");
        fizik = sc1.nextInt();

        System.out.println("Kimya Notunuzu Giriniz:");
        kimya = sc1.nextInt();

        System.out.println("Türkçe Notunuzu Giriniz:");
        türkçe = sc1.nextInt();

        System.out.println("Tarih Notunuzu Giriniz:");
        tarih = sc1.nextInt();


        System.out.println("Müzik Notunuzu Giriniz:");
        müzik = sc1.nextInt();

        int top = (mat+fizik+kimya+türkçe+tarih+müzik);
        double ort = top/6;

        System.out.println((ort));

        /*
        Aynı program içerisinde koşullu ifadeler kullanılarak,
        eğer kullanıcının ortalaması 60'dan büyük ise ekrana
        "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
         */

        if(ort>=60){
            System.out.println(("Sınıfı Geçtiniz"));
        }

        else{
            System.out.println(("Sınıfta Kaldınız"));
        }

    }
}
