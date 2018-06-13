import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item item;

    @Before
    public void before(){
        item = new Item("item1", 10, 1, false);

    }

    @Test
    public void canGetName(){
        assertEquals("item1", item.getName());
    }

    @Test
    public void canGetPrice(){
        assertEquals(10, item.getPrice(), 0.01);
    }

    @Test
    public void canGetQuantity(){
        assertEquals(1, item.getQuantity());
    }

    @Test
    public void canSetQuantity(){
        assertEquals(2, item.setQuantity(2));
    }

    @Test
    public void canGetBogof(){
        assertEquals(false, item.getBogof());
    }

    @Test
    public void canSetBogof(){
        assertEquals(true, item.setBogof());
    }


}
