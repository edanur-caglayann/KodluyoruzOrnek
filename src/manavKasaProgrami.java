import java.util.Scanner;

public class manavKasaProgrami {
    public static void main(String[]args){
        /*
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
         */


        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç kilo armut aldınız:");
        armut = scanner.nextInt();
        System.out.println("Kaç kilo elma aldınız:");
        elma = scanner.nextInt();
        System.out.println("Kaç kilo domates aldınız:");
        domates = scanner.nextInt();
        System.out.println("Kaç kilo muz aldınız:");
        muz = scanner.nextInt();
        System.out.println("Kaç kilo patlican aldınız:");
        patlican = scanner.nextInt();

        double topTutar;
        topTutar=(2.14*armut)+(3.67*elma)+(1.11*domates)+(0.95*muz)+(5.00*patlican);


        System.out.println("Toplam Alışveriş Tutarınız:" +topTutar);

    }
}
