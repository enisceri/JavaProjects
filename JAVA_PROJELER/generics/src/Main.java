import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList <Integer> id_numbers = new ArrayList<Integer>();
        //ArrayList Integer ile calisan bir generic class'tir.

        ArrayList <String> sehirler = new ArrayList<String>();
        //ArrayList String ile calisan bir generic class'tir.


        MyList<String> ulkeler = new MyList<>();
        ulkeler.add("Turkiye");
        ulkeler.add("Almanya");

    }
}
