import java.util.Scanner;

public class daireDilimiminAlani {
    public static void main(String[]args){
        /*
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.

        Formül : (𝜋 * (r*r) * 𝛼) / 360
         */

        int yaricap, merkezAcisi;
        double alan;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hesaplamak istediğinin daire diliminin yarıçap değerini ve merkez açısının ölçüsünü giriniz:");

        yaricap =scanner.nextInt();
        merkezAcisi=scanner.nextInt();

        alan = (3.14*(yaricap * yaricap)*merkezAcisi)/360;

        System.out.println("Daire diliminin alanı:"+alan);

    }
}
