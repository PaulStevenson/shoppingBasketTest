import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CheckoutTest {

    Checkout checkout;
    Basket basketList;
    Item item;
    Item item2;

    @Before
    public void before(){
        checkout = new Checkout(true);
        basketList = new Basket();
        item = new Item("item1", 12, 1, true);
        item2 = new Item("item2", 10, 1, false);
    }

    @Test
    public void canCountBasketListInCheckout(){
        assertEquals(0, basketList.count());
    }

    @Test
    public void canAddToBasketListInCheckout(){
        basketList.add(item);
        assertEquals(1, basketList.count());
    }

    @Test
    public void canRemoveFromBasketListInCheckOut(){
        basketList.add(item);
        basketList.remove(item);
        assertEquals(0, basketList.count());
    }

    @Test
    public void canGetMemebershipDiscount(){
        assertEquals(true, checkout.getMembershipDiscount());
    }

    @Test
    public void canSetMemebershipDiscount(){
        assertEquals(false, checkout.setMembershipDiscount());
    }




}
