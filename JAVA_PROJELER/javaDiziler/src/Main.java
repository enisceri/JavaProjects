import javax.print.DocFlavor;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        String ogrenci1 = "Enis";
        String ogrenci2 = "Mustafa Eren";
        String ogrenci3 = "Husna";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("--------------");

        String[] ogrenciler = new String[3];

        ogrenciler[0] = "Enis";
        ogrenciler[1] = "Mustafa Eren";
        ogrenciler[2] = "Husna";

        for (int i = 0; i < ogrenciler.length; i++)
            System.out.println(ogrenciler[i]);

        System.out.println("--------------");

        for (String ogrenci : ogrenciler)
            System.out.println(ogrenci);

        //int arrays

        int[] sayilar = new int[5];
        for (int i = 0; i < sayilar.length; i++)
            sayilar[i] = i;

        for (int sayi : sayilar) {
            System.out.println(sayi);

        }

        double[] dSayilar = {1, 2.5, 3.1, 4.2};
        double total = 0;
        for (double dSayi : dSayilar) {
            total += dSayi;
            System.out.println(dSayi);
        }
        System.out.println("Total number is :" + total);


    }
}
