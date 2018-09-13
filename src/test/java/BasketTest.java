import Products.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BasketTest {

    Basket basket;
    Pizza pizza;
    Burger burger;
    Fries fries;
    Salad salad;


    @Before
        public void before(){
        basket = new Basket("shopping basket");
        pizza = new Pizza("Amazing Pizza!", "Dwt5F7KAhi", 1099, 1, Promotion.TWOFORX);
        burger = new Burger("Amazing Burger!", "PWWe3w1SDU", 999,1, Promotion.BOGOF);
        fries = new Fries("Boring Fries!", "4MB7UfpTQs", 199, 1, Promotion.NULL);
        salad = new Salad("Amazing Salad!", "Gm1piPn7Fg", 499, 1, Promotion.TENPERCENTOFF);
    }

    @Test
        public void canGetName(){
            assertEquals("shopping basket", basket.getName());
    }

    @Test
        public void canCheckIfBasketIsEmpty(){
            assertEquals(0,basket.countProducts());
    }

    @Test
        public void canAddProductToBasket(){
            basket.addProduct(pizza);
            assertEquals(1,basket.countProducts());
    }

    @Test
        public void canRemoveProductFromBasket(){
            basket.addProduct(pizza);
            basket.removeProduct(pizza);
            assertEquals(0,basket.countProducts());
    }

    @Test
        public void addMultipleProducts(){
            basket.addProduct(pizza);
            basket.addProduct(burger);
            assertEquals(2,basket.countProducts());
    }

    @Test
        public void removeMultipleProducts(){
            basket.addProduct(pizza);
            basket.addProduct(burger);
            basket.removeProduct(pizza);
            basket.removeProduct(burger);
            assertEquals(0,basket.countProducts());

    }
}
