package Products;

public abstract class Product {


    private String name;
    private String id;
    private int price;
    private int quantity;
    private Products.Promotion promotion;

    public Product(String name, String id, int price, int quantity, Products.Promotion Promotion){
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.promotion = Promotion;
    }

    public String getName(){
        return this.name;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Products.Promotion getPromotion() {
        return promotion;
    }
}
