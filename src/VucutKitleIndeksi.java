import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[]args){
        /*
        Java ile kullanıcıdan boy ve kilo değerlerini alıp
        bir değişkene atayın. Aşağıdaki formüle göre kullanıcının
        "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

        Formül
        Kilo (kg) / Boy(m) * Boy(m)
         */

        double boy,kilo;
        double vucutKitleIndeksiSonucu;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Boy ve Kilo değerlerinizi giriniz:");
        boy = scanner.nextDouble();
        kilo = scanner.nextDouble();

        boy =boy/100.0; // cm'den m'ye çevirdik.

        vucutKitleIndeksiSonucu = ((kilo)/(boy*boy));
        System.out.println("Sonuç-->"+vucutKitleIndeksiSonucu);


    }
}
