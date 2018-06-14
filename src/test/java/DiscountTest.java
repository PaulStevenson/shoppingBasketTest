import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiscountTest {

    Discount discount;

    @Before
    public void before() {
        discount = new Discount(true, 0.1);
    }

    @Test
    public void canGetMemebershipDiscount(){
        assertEquals(true, discount.getMembershipDiscount());
    }

    @Test
    public void canSetMemebershipDiscount(){
        assertEquals(false, discount.setMembershipDiscount());
    }

    @Test
    public void canGetPromotionalDiscount(){
        assertEquals(.1, discount.getPromotionalDiscount(), 0.01);
    }

    @Test
    public void canSetPromotionalDiscount(){
        assertEquals(.2, discount.setPromotionalDiscount(), 0.01);
    }






}
