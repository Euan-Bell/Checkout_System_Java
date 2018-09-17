import Products.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BasketTest {

    Basket basket;
    Pizza pizza;
    Pizza testPizza;
    Burger burger;
    Burger testBurger;
    Fries fries;
    Salad salad;
    Salad testSalad;



    @Before
        public void before(){
        basket = new Basket("shopping basket");
        pizza = new Pizza("Amazing Pizza!", "Dwt5F7KAhi", 1099, 1, Promotion.TWOFORX);
        testPizza = new Pizza("Amazing Pizza!", "Dwt5F7KAhi", 1099, 2, Promotion.TWOFORX);
        burger = new Burger("Amazing Burger!", "PWWe3w1SDU", 999,1, Promotion.BOGOF);
        testBurger = new Burger("Amazing Burger!", "PWWe3w1SDU", 1998,2, Promotion.BOGOF);
        fries = new Fries("Boring Fries!", "4MB7UfpTQs", 199, 1, Promotion.NULL);
        salad = new Salad("Amazing Salad!", "Gm1piPn7Fg", 499, 1, Promotion.TENPERCENTOFF);
        testSalad = new Salad("Amazing Salad!", "Gm1piPn7Fg", 499, 3, Promotion.TENPERCENTOFF);
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
        public void canAddMultipleProducts(){
            basket.addProduct(pizza);
            basket.addProduct(burger);
            assertEquals(2,basket.countProducts());
    }

    @Test
        public void canRemoveMultipleProducts(){
            basket.addProduct(pizza);
            basket.addProduct(burger);
            basket.removeProduct(pizza);
            basket.removeProduct(burger);
            assertEquals(0,basket.countProducts());
    }

//    @Test
//        public void canCheckBasket(){
//            basket.addProduct(pizza);
//            assertEquals(pizza,basket.checkBasket());
//    }

    @Test
        public void canGetTotalCost(){
            basket.addProduct(pizza);
            basket.addProduct(burger);
            assertEquals(2098, basket.getTotalCost());
    }

    @Test
        public void canGetPromotionalCost(){
            assertEquals(449, basket.getPromotionCost(salad));
    }

    @Test
        public void canGetBOGOFPromotionalCost(){
            basket.addProduct(testBurger);
            assertEquals(999, basket.getBOGOFPromotionalCost(testBurger));
    }

    @Test
        public void canGetNULLPromotionalCost(){
            basket.addProduct(fries);
            assertEquals(199, basket.getNULLPromotionalCost(fries));
    }

    @Test
        public void canGetTwoForXPromotionalCost(){
            basket.addProduct(testPizza);
            assertEquals(1799, basket.getTwoForXPromotionalCost(testPizza));
    }

    @Test
        public void canGetTotalPromotionalCost(){
            basket.addProduct(salad);
            assertEquals(449, basket.getTotalPromotionalCost());
    }

    @Test
    public void canGetTotalPromotionalCostWithTwoMatchingProducts(){
        basket.addProduct(salad);
        basket.addProduct(salad);
        assertEquals(898, basket.getTotalPromotionalCost());
    }

    @Test
        public void canCheckProductsWithGreaterQuantityOfOne(){
            basket.addProduct(testSalad);
            assertEquals(1497, basket.getTotalCost());

    }

    @Test
    public void canCheckProductsWithGreaterQuantityOfOneWithPromotion(){
        basket.addProduct(testSalad);
        assertEquals(1347, basket.getTotalPromotionalCost());

    }
}
