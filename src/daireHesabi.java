import java.util.Scanner;

public class daireHesabi {
    public static void main(String[]args){
        /*
        Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

        Alan Formülü : π * r * r;

        Çevre Formülü : 2 * π * r;
         */

        int yaricap;
        double alan,cevre;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yarıçap değeri giriniz:");
        yaricap=scanner.nextInt();

        alan=(3.14)*yaricap*yaricap;
        cevre=2*(3.14)*yaricap;

        System.out.println("Alan:"+alan);
        System.out.println("Çevre:"+cevre);


    }
}
