import javax.naming.PartialResultException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner kullaniciGirisi = new Scanner(System.in);


        System.out.println("Enis Ceri");
        //Degiskenler

        int sayi = 1;
        String mesaj;
        System.out.println("Sayi degiskeninin degeri " + sayi);

        if (sayi == 10) {
            mesaj = "Sayi = 10";
            System.out.println("Mesaj :" + mesaj);
        }

        else {
            mesaj = "Sayi 10'dan farkli";
            System.out.println(mesaj);
        }

        System.out.println("Lutfen bir sayi giriniz:");
        String  degiskenSayi = kullaniciGirisi.next();

        System.out.println("Girdiginiz sayi :" + degiskenSayi);
        
    }
}
