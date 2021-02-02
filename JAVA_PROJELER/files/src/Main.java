import java.io.*;
import java.io.BufferedWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //getFileInfo();
        readFile("students.txt");
        writeFile("students.txt");
        readFile("students.txt");
        writeFile("yeni.txt");
        readFile("students.txt");


    }

    public static void createFile()
    {

        File file = new File("D:\\JAVA_KURULUM_DOSYALAR\\JAVA_PROJELER\\DOSYALAR\\students.txt");
        try {
            if(file.createNewFile())
            {
                System.out.println("Dosya oluşturuldu.");
            }
            else
            {
                System.out.println("Dosya zaten mevcut.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void getFileInfo()
    {
        File file = new File("D:\\JAVA_KURULUM_DOSYALAR\\JAVA_PROJELER\\DOSYALAR\\students.txt");

        if(file.exists())
        {
            System.out.println("Dosya adı             : "+ file.getName());
            System.out.println("Dosya yolu            : "+ file.getAbsolutePath());
            System.out.println("Dosya yazilabilir mi  : "+ file.canWrite());
            System.out.println("Dosya okunabilir mi   : "+ file.canRead());
            System.out.println("Dosya boyutu (byte)   : "+ file.length());


        }
    }


    public static void readFile(String fileName)
    {
        File file = new File("D:\\JAVA_KURULUM_DOSYALAR\\JAVA_PROJELER\\DOSYALAR\\" + fileName);

        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine())
            {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }


    }

    public static  void writeFile(String fileName)
    {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\JAVA_KURULUM_DOSYALAR\\JAVA_PROJELER\\DOSYALAR\\" + fileName, true));
            writer.newLine();
            writer.write("Ahmet");

            System.out.println("Dosyaya yazildi.");
            writer.close();
        }
        catch (IOException exception)
        {
            exception.printStackTrace();
        }

    }
}
