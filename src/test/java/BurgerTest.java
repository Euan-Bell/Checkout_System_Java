import Products.Burger;
import Products.Promotion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BurgerTest {

    Burger burger;

    @Before
        public void before(){
        burger = new Burger("Amazing Burger!", "PWWe3w1SDU", 999,1, Promotion.BOGOF);
    }

    @Test
        public void canGetName(){
        assertEquals("Amazing Burger!", burger.getName());
    }

    @Test
        public void canGetId(){
        assertEquals("PWWe3w1SDU", burger.getId());
    }

    @Test
        public void canGetPrice(){
        assertEquals(999,burger.getPrice());
    }

    @Test
        public void canGetQuantity(){
        assertEquals(1, burger.getQuantity());
    }

    @Test
        public void canGetPromotion(){
        assertEquals(Promotion.BOGOF, burger.getPromotion());
    }
}
