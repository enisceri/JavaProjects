public class Main {

    public static void main(String[] args) {

        Product product = new Product(1,"Su",3);

        ProductManager productManager = new ProductManager(new OracleProductDal());
        productManager.addProduct(product);

    }
}
