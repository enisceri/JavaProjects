import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        /*

        int dizi[] = new int[] {1,2,3};

        ArrayList veriler = new ArrayList();

        veriler.add(1);
        veriler.add(7);
        veriler.add("Enis");


        veriler.set(2,"ÇEri");
        */
        //TYPE SAFE ARRAYLISTS
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Tokat");
        sehirler.add("İstanbul");
        sehirler.add("Ankara");

        for (String sehir : sehirler)
            System.out.println(sehir);
        System.out.println("--------------------");


        //Turkce karakterlere gore siralamak
        Locale turkish = new Locale("tr_TR");
        Collator turkishCollator = Collator.getInstance(turkish);
        Collections.sort(sehirler, turkishCollator);
        for (String sehir : sehirler)
            System.out.println(sehir);

        System.out.println("***************");
        ArrayList<String> isimler = new ArrayList<String>();

        isimler.add("Enis");
        isimler.add("Hüsna");
        isimler.add("Ümran");
        isimler.add("Seyit");
        isimler.add("Mustafa Eren");
        isimler.add("Zeynep");

        for(String isim:isimler)
            System.out.println(isim);

        System.out.println("***************");
        Locale turkce = new Locale("tr");
        Collator turkceCollator = Collator.getInstance(turkce);
        Collections.sort(isimler,turkceCollator);
        for(String isim:isimler)
            System.out.println(isim);
        System.out.println("***************");


    }
}
