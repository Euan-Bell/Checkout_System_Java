import Products.Promotion;
import org.junit.Before;
import org.junit.Test;
import Products.Pizza;


import static org.junit.Assert.assertEquals;

public class PizzaTest {

    Pizza pizza;

    @Before
    public void before(){
        pizza = new Pizza("Amazing Pizza!", "Dwt5F7KAhi", 1099, 1, Promotion.TWOFORX);
    }

    @Test
        public void canGetName(){
        assertEquals("Amazing Pizza!", pizza.getName());
    }

    @Test
        public void canGetId(){
        assertEquals("Dwt5F7KAhi", pizza.getId());
    }

    @Test
        public void canGetPrice(){
        assertEquals(1099, pizza.getPrice());
    }

    @Test
        public void canGetQuantity(){
        assertEquals(1, pizza.getQuantity());
    }

    @Test
        public void canGetPromotion(){
        assertEquals(Promotion.TWOFORX, pizza.getPromotion());
    }

}
