public class OracleProductDal implements IBaseProductDal{
    @Override
    public void addProduct(Product product) {
        System.out.println("Urun " + product.getName() + " Oracle veri tabanina eklendi.");
    }
}
