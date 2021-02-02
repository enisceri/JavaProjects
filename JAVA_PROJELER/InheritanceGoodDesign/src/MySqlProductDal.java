public class MySqlProductDal implements IBaseProductDal{
    @Override
    public void addProduct(Product product) {
        System.out.println("Urun " + product.getName() + " MySql veri tabanina eklendi.");
    }
}
