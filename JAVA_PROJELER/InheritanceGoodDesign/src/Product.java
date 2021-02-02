public class Product {
    //attribute
    private int _id;
    private String _name;
    private double _price;

    //constructor
    public Product(int id, String name, double price)
    {
        setId(id);
        setName(name);
        setPrice(price);

    }


    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double _price) {
        this._price = _price;
    }
}
