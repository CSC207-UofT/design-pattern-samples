package facade.with_facade;

public class OrderItem {

    private final FoodItem Item;
    private final int quantity;

    public OrderItem(FoodItem item, int quantity) {
        this.Item = item;
        this.quantity = quantity;
    }

    public FoodItem getItem() {
        return this.Item;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String toString() {
        return Item.toString() + "," + quantity;
    }

}
