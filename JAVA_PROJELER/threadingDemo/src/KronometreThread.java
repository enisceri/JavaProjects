public class KronometreThread implements Runnable {

    private Thread thread;//Standart
    private String threadName;//Standart

    public KronometreThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Olusturuluyor: " + threadName);
    }

    @Override
    public void run() {
        //Bunun icindeki operasyonlar degisir sadece.

        System.out.println("Calistiriliyor: " + threadName);

        try
        {
            for(int i = 0; i <= 10; i++)
            {
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000);

            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Kesildi :" +threadName);

        }
        System.out.println("Thread bitti :"+ threadName);

    }

    public void start()
    {//Bu fonk standarttir. Her thread icinde vardir.
        System.out.println("Thread nesnesi olusturuluyor.");
        if(thread == null)
        {
            thread = new Thread(this,threadName);
            thread.start();
        }



    }
}
