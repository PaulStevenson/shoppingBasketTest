import java.util.ArrayList;

public class Basket {

    private ArrayList<Item> basketList;

    public Basket(){
        basketList = new ArrayList<>();
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
}
