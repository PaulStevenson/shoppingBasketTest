import com.sun.tools.javac.comp.Check;

import java.util.ArrayList;

public class Checkout {

    private boolean membershipDiscount;
    private Basket basket;
    private Item item;

    public Checkout(boolean membershipDiscount){
        this.membershipDiscount = membershipDiscount;
    }


    public boolean getMembershipDiscount() {
        return membershipDiscount;
    }

    public boolean setMembershipDiscount() {
        return this.membershipDiscount = false;
    }




}
