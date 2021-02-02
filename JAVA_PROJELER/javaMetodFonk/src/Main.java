import java.util.Scanner;
public class Main {
    //camel casing fonk isimlerinin ilk harfi kucuk birlesik kelimenin ilk harfi buyuk.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("------------");
            System.out.println("1. Toplama\n" +
                    "2. Cikarma\n" +
                    "3. Carpma\n" +
                    "4. Bolme\n" +
                    "5. Cikis icin q");
            System.out.println("------------");
            System.out.print("Islemi seciniz:");
            String secim = scanner.next();
            secim = secim.toLowerCase();

            if(secim.equals("q")) {
                System.out.println("Cikis yapiliyor...");
                break;
            }

            else if(secim.equals("1"))
            {
                System.out.println("Kac sayi toplamak istiyorsunuz:");
                int kacSayi = scanner.nextInt();

                for(int i = 0; i < kacSayi; i++)
                {

                }




            }

            else if(secim == "2")
                break;
            else if(secim == "3")
                break;
            else if(secim == "4")
                break;



        }

    }

    public static double toplama(double... sayilar)
    {
        double toplam = 0;
        for(double sayi:sayilar)
            toplam += sayi;
        return toplam;
    }

    public static void faktoriyel(int sayi)
    {
        int fact = 1;
        while(sayi > 0)
        {
            fact *= sayi;
            sayi--;
        }
        System.out.println("Sonuc : " + fact);
    }


    public static void sayiBul(int arananSayi)
    {
        int[] sayilar = new int[] {1,2,3,4,5};
        boolean bulundu = false;
        for(int sayi:sayilar)
        {
            if(sayi == arananSayi)
            {
                bulundu = true;
                break;
            }

        }
        if(bulundu)
            System.out.println("Sayi bulundu.");

        else
            System.out.println("Sayi bulunamadi.");
    }


}
