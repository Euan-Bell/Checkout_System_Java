public class Product {


    private String name;
    private String id;
    private int price;
    private int quantity;

    public Product(String name, String id, int price, int quantity){
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return this.name;
    }

}
