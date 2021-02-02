public class ProductValidator {

    public static boolean isValid(Product product)
    {
        if(product.id > 0 && !(product.name.isEmpty()))
            return true;

        else
            return false;

    }
}
