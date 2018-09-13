import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    Product product;

    @Before
    public void before(){
        product = new Product("Amazing Pizza!", "Dwt5F7KAhi", 1099, 1);
    }

    @Test
        public void canGetName(){
        assertEquals("Amazing Pizza!", product.getName());

    }

}
