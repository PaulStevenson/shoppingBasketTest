import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BasketTest {

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
        assertEquals(22, basketList.calculateTotalBasketCost(), 0.01);
    }

//    @Test
//    public void canGetNameOfTwoItemsInBasket(){
//        basketList.add(item);
//        basketList.add(item2);
//        assertEquals("item1",  basketList.getMultipleItemNames());
//        assertEquals("item2",  basketList.getMultipleItemNames());
//    }

//    @Test
//    public void increaseQuantityforBOGOF(){
//        basketList.add(item);
//        assertEquals(2, basketList.increaseQuantityforBOGOF());
//    }


}
