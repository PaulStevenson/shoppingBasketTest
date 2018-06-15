import java.util.ArrayList;

public class Basket {

    private ArrayList<Item> basketList;


    public Basket(){
        this.basketList = new ArrayList<>();
    }

    public int count() {
        return basketList.size();
    }

    public void add(Item item) {
        basketList.add(item);
    }

    public void remove(Item item) {
        basketList.remove(item);
    }

    public double calculateTotalBasketCost() {
        double total = 0;
        for (Item itemPrice : basketList){
            total += itemPrice.getPrice();
        }
        return total;
    }




//    public String getMultipleItemNames() {
//
//        for (Item itemName : basketList){
//            itemName.getName();
//        }
//        return item.getName();
//    }

//    public int increaseQuantityforBOGOF() {
//
//        if (item.getBogof() == true) {
//            item.setQuantity(2);
//        }
//
//        return item.getQuantity();
//    }

}
