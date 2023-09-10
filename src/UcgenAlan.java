import java.util.Scanner;

public class UcgenAlan {

    //Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
    public static void main(String[]args){

        int taban , yukseklik, hipotenus;
        int u,e,d;
        Scanner sc = new Scanner(System.in);

        System.out.println("Taban,Yükseklik,hipotenüs değerlerini giriniz:");
        taban = sc.nextInt();
        yukseklik = sc.nextInt();
        hipotenus = sc.nextInt();


        u= (taban+ yukseklik + hipotenus)/2;
        e=2*u;
        d=(int) Math.sqrt(u*(u-taban)*(u- yukseklik)*(u- hipotenus));
        System.out.println("Üçgenin alanı:  "+ d);




    }
}
