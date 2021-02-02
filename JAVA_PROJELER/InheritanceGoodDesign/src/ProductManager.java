public class ProductManager {
    IBaseProductDal baseProductDal;

    public ProductManager(IBaseProductDal baseProductDal)
    {
        this.baseProductDal = baseProductDal;
    }
    public void addProduct(Product product)
    {
        System.out.println("Product Manager'in fonk'u calisti. Bu bir is katmanidir.");
        System.out.println(product.getName() + " veri tabanina eklendi. Urun ID:" + product.getId() + " urun fiyat "
        + product.getPrice());

        baseProductDal.addProduct(product);




    }
}
