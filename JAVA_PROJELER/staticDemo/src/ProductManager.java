public class ProductManager {

    public void addProduct(Product product)
    {


        if(ProductValidator.isValid(product))
            System.out.println("Ürün veri tabanına eklendi.");

        else
            System.out.println("Ürün veri tabanına eklenemedi.");
    }
}
