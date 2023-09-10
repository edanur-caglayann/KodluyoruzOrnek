import java.util.Scanner;

public class taksimetreHesabi {
    public static void main(String[]args){
        /*
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.

         */
        double gidilenMesafe;
        double kmBasi = 2.20;
        int acilisUcreti = 10;
        double tutar;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gidilecek mesafe:");
        gidilenMesafe =scanner.nextDouble();
        if(gidilenMesafe<=5){
            tutar=20;
        }
        else{
            tutar = gidilenMesafe*kmBasi;
            tutar+=acilisUcreti;
        }

        System.out.println("Ödenecek Tutar:"+tutar);



    }
}
