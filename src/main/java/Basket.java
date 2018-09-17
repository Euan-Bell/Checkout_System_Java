import Products.Product;
import Products.Promotion;

import java.util.ArrayList;

public class Basket {

    private String name;
    private ArrayList<Product> products;

    public Basket(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int countProducts(){
        return this.products.size();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

     public void removeProduct(Product product){
        this.products.remove(product);
     }


    public int getTotalCost() {
        int totalCost = 0;
        for (int i = 0; i < this.products.size(); i++) {
            totalCost = totalCost + (this.products.get(i).getPrice() * this.products.get(i).getQuantity());
        }
        return totalCost;
    }

    public int getPromotionCost(Product product){
        double promotionalCost = 0;
        if (product.getPromotion() == Promotion.TENPERCENTOFF){
            promotionalCost = product.getPrice() *0.9;
        }
        else promotionalCost = product.getPrice();
        return (int) Math.round(promotionalCost);
    }

    public int getBOGOFPromotionalCost(Product product){
        double promotionalCost = 0;
        if (product.getQuantity() == 2){
            promotionalCost = product.getPrice() -999;
        }
        else promotionalCost = product.getPrice();
        return (int) Math.round(promotionalCost);
    }

    public int getTwoForXPromotionalCost(Product product){
        double promotionalCost = 0;
        if (product.getQuantity() == 2){
            promotionalCost = product.getPrice() +700;
        }
        else promotionalCost = product.getPrice();
        return (int) Math.round(promotionalCost);
    }

    public int getNULLPromotionalCost(Product product){
        if (product.getPromotion() == Promotion.NULL){
        }
        return product.getPrice();
    }



    public int getTotalPromotionalCost() {
        int totalPromotionalCost = 0;
        for (int i = 0; i < this.products.size(); i++) {
            totalPromotionalCost = totalPromotionalCost + (this.getPromotionCost(this.products.get(i)) * this.products.get(i).getQuantity());
        }
        return totalPromotionalCost;
    }


}

