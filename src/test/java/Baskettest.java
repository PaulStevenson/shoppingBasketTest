import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Baskettest {

    Basket basketList;
    Item item;
    Item item2;

    @Before
    public void before(){
        basketList = new Basket();
        item = new Item("item1", 12, 1, true);
        item2 = new Item("item2", 10, 1, false);

    }

    @Test
    public void canCountBasketList(){
        assertEquals(0, basketList.count());
    }

    @Test
    public void canAddToBasketList(){
        basketList.add(item);
        assertEquals(1, basketList.count());
    }

    @Test
    public void canRemoveFromBasketList(){
        basketList.add(item);
        basketList.remove(item);
        assertEquals(0, basketList.count());
    }

    @Test
    public void calculateTotalPriceInBasket(){
        basketList.add(item);
        basketList.add(item2);
        assertEquals(22, basketList.calculateTotalBasketCost());

    }
}
