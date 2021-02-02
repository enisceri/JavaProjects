import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ValidInput validInput = new ValidInput();



        int number;
        int sayi ;
        ValidInput validInput1 = new ValidInput();

        while(true)
        {
            System.out.println("Sayi gir:");


            try{
                sayi = scanner.nextInt();

            }
            catch (InputMismatchException e)
            {
                System.out.println("Sayi degil");
                sayi = scanner.nextInt();
            }

        }


    }
}
