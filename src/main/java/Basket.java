import Products.Product;

import java.util.ArrayList;

public class Basket {

    private String name;
    private ArrayList<Product> basket;

    public Basket(String name) {
        this.name = name;
        this.basket = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int countProducts(){
        return this.basket.size();
    }
}
