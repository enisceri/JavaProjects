//BaseLogger class'indan türetilmis ve DataBase'e loglama yapan class
public class DataBaseLogger extends  BaseLogger{

    public void Log(String message)
    {
        System.out.println("Logged to database :" + message);
    }

}
