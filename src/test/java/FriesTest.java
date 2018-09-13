import Products.Fries;
import Products.Promotion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FriesTest {

    Fries fries;

    @Before
        public void before(){
            fries = new Fries("Boring Fries!", "4MB7UfpTQs", 199, 1, Promotion.NULL);
    }

    @Test
        public void canGetName(){
            assertEquals("Boring Fries!", fries.getName());
    }

    @Test
        public void canGetId(){
            assertEquals("4MB7UfpTQs", fries.getId());
    }

    @Test
        public void canGetPrice(){
            assertEquals(199, fries.getPrice());
    }

    @Test
        public void canGetQuantity(){
            assertEquals(1, fries.getQuantity());
    }

    @Test
        public void canGetPromotion(){
            assertEquals(Promotion.NULL, fries.getPromotion());
    }


}