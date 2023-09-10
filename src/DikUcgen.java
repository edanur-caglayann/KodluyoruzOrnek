import java.util.Scanner;

public class DikUcgen {
    public static void main(String[]args){
        //Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

        int taban , yukseklik;
        Scanner sc = new Scanner(System.in);

        System.out.println("Taban,Yükseklik değerlerini giriniz:");
        taban = sc.nextInt();
        yukseklik = sc.nextInt();
        double Alan = ((taban)*(yukseklik))/2;

        System.out.println(Alan);


    }
}
