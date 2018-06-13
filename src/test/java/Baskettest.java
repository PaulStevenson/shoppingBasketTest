import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Baskettest {

    Basket basketList;
    Item item;

    @Before
    public void before(){
        basketList = new Basket();

    }

    @Test
    public void canCountBasketList(){
        assertEquals(0, basketList.count());
    }

    @Test
    public void canAddToBasketList(){
        item = new Item("item2", 10, 1, false);
        basketList.add(item);
        assertEquals(1, basketList.count());
    }

    @Test
    public void canRemoveFromBasketList(){
        item = new Item("item2", 10, 1, false);
        basketList.add(item);
        basketList.remove(item);
        assertEquals(0, basketList.count());
    }
}
