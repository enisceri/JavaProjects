public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger)
    {
        this.logger = logger;

    }

    public void AddCustomer()
    {
        System.out.println("Customer added.");

        this.logger.Log("Log mesaji");
    }

}
