import java.util.Scanner;

public class kullaniciGirisi {
    /*
    Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp
    sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse
    yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre
    ile aynı olmaması gerektiğini kontrol edip , şifreler aynı
    ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
    sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
     */

    public static void main(String[]args){
        int asilSifre = 123;
        int sifre,yeniSifre,secim;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Şifrenizi giriniz:");
        sifre =scanner.nextInt();

        if(sifre==asilSifre){
            System.out.println("Giriş yapıldı.");
        }
        else{
            System.out.println("Parola yanlış.");
            System.out.println(" Parolayı sıfırlamak istiyor musunuz? \n 1)EVET \n 2)HAYIR");
            secim = scanner.nextInt();

            if (secim==1){
                System.out.println("Yeni parolanızı giriniz:");
                yeniSifre = scanner.nextInt();
                if(yeniSifre==asilSifre){
                    System.out.println("Yeni parolanız eskisi ile aynı olamaz. \n Parola oluşturulamadı. Lütfen başka parola giriniz");
                    yeniSifre = scanner.nextInt();
                    System.out.println("Parola oluşturuldu.");

                }
                else{
                    System.out.println("Parola oluşturuldu.");
                }

            }
            else{
                System.out.println("Çıkış yapılıyor.");
            }
        }

    }

}
