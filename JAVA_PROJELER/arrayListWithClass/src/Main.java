import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> musteriler = new ArrayList<Customer>();

        musteriler.add(new Customer(1,"Enis","Çeri"));
        musteriler.add(new Customer(2,"Seyit","Çeri"));
        musteriler.add(new Customer(3,"Mustafa Eren","Çeri"));


        musteriler.remove(1);

        for(Customer customer:musteriler)
            customer.customerInfos();







    }
}
