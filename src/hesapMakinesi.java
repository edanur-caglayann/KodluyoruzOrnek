import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[]args){
        int sayi1,sayi2,secim;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz:");
        sayi1 = scanner.nextInt();

        System.out.println("2. sayıyı giriniz:");
        sayi2 = scanner.nextInt();

        System.out.println("1)Toplama \n 2)Çıkarma \n 3)Bölme \n 4)Çarpma");
        System.out.println("Yapmak istediğiniz işlemi seçiniz:");
        secim = scanner.nextInt();

        if(secim==1){
            System.out.println( "Toplam:" + (sayi1+sayi2));
        } else if (secim==2) {
            if(sayi1>sayi2){
              System.out.println("Çıkarma:" + (sayi1-sayi2));
            }
            else{
                System.out.println("Çıkarma:" + (sayi2-sayi1));
            }
        } else if (secim==3) {
            System.out.println("Bölme:" + (sayi1/sayi2));
        }
        else {
            System.out.println("Çarpma:" + (sayi1*sayi2));
        }

    }
}
