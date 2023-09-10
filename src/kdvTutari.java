import java.util.Scanner;

public class kdvTutari {
    public static void main(String[]args){
        /*
        Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        ( Not : KDV tutarını 18% olarak alın)

        KDV'siz Fiyat = 10;

        KDV'li Fiyat = 11.8;

        KDV tutarı = 1.8;
         */

        double para ;
        double kdvOran= 0.18 ;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Para miktarınızı giriniz:");
        para = scanner.nextDouble();

        //KDV'li tutar
        double kdvTutarii= (para)*kdvOran;
        double kdvliTutari = kdvTutarii+para;

        System.out.println("KDV'siz Fiyat ="+para);
        System.out.println("KDV Oranı ="+kdvOran);
        System.out.println("KDV Tutarı ="+kdvTutarii);
        System.out.println("KDV'li Fiyat ="+kdvliTutari);


    }
}
