public class Main {

    public static void main(String[] args) {
        AccountManager manager = new AccountManager();

        System.out.println("Hesap = " + manager.getBalance());

        manager.deposit(300);
        System.out.println("Hesap = " + manager.getBalance());
        try
        {
            manager.withdraw(599);
        }
        catch (BalanceInsufficientException exception)
        {
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap = " + manager.getBalance());


    }
}
