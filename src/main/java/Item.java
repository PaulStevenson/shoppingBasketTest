public class Item {

    private String name;
    private double price;
    private int quantity;
    private boolean bogof;

    public Item(  String name, double price, int quantity, boolean bogof){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.bogof = bogof;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int setQuantity() {
        return this.quantity = 2;
    }

    public boolean getBogof() {
        return bogof;
    }

    public boolean setBogof() {
        return this.bogof = true;
    }
}
