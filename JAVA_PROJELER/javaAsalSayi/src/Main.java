import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {

        boolean asal = true;
        Scanner inputSayi = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz:");
        String strSayi = inputSayi.next();

        int iSayi = Integer.parseInt(strSayi);

        for(int i = iSayi - 1; i > 1; i--)
        {
            if(iSayi % i == 0)
            {
                System.out.println("Boldugu sayi" + i);
                asal = false;
                break;
            }


        }
        if(asal)
            System.out.println("Sayi asaldir.");
        else
            System.out.println("Sayi asal değildir.");


    }
}
