import Products.Promotion;
import Products.Salad;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaladTest {

  Salad salad;

  @Before
    public void before(){
      salad = new Salad("Amazing Salad!", "Gm1piPn7Fg", 499, 1, Promotion.TENPERCENTOFF);
  }

  @Test
    public void canGetName(){
      assertEquals("Amazing Salad!", salad.getName());
  }

  @Test
    public void canGetId(){
      assertEquals("Gm1piPn7Fg", salad.getId());
  }

  @Test
    public void canGetPrice(){
      assertEquals(499, salad.getPrice());
  }

  @Test
    public void canGetQuantity(){
      assertEquals(1, salad.getQuantity());
  }

  @Test
    public void canGetPromotion(){
      assertEquals(Promotion.TENPERCENTOFF, salad.getPromotion());
  }
}
