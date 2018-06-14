public class Discount {

    private boolean membershipDiscount;
    private double promotionalDiscountPercentage;


    public Discount(boolean membershipDiscount, double promotionalDiscountPercentage){
        this.membershipDiscount = membershipDiscount;
        this.promotionalDiscountPercentage = promotionalDiscountPercentage;
    }

    public boolean getMembershipDiscount() {
        return membershipDiscount;
    }

    public boolean setMembershipDiscount() {
        return this.membershipDiscount = false;
    }

    public double getPromotionalDiscount() {
        return this.promotionalDiscountPercentage;
    }

    public double setPromotionalDiscount() {
       return this.promotionalDiscountPercentage = .2;
    }
}
