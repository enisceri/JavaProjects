public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        //customerManager.baseDataBaseManager = new OracleManager();
        customerManager.getCustomer(new OracleManager());
    }
}
