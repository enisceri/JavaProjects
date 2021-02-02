import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = null;
        int total = 0;
        try {
            reader = new BufferedReader(new FileReader("D:\\JAVA_KURULUM_DOSYALAR\\JAVA_PROJELER\\readinFileDemo\\src\\sayilar.txt"));
            String line = null;
            while((line = reader.readLine()) != null)
            {
                total += Integer.valueOf(line);

            }
            System.out.println("Toplam = "+ total);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Dosya bulunamadi. Hata : " + fileNotFoundException);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
