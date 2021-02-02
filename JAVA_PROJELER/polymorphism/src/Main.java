public class Main {

    public static void main(String[] args) {
//
//        BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new EmailLogger(),new DataBaseLogger()};
//
//        for(BaseLogger logger:loggers)
//            logger.Log("Log mesaji");

        CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
        customerManager.AddCustomer();

    }
}
