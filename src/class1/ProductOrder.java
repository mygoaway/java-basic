package class1;

public class ProductOrder {
    String productName;
    int price;
    int quantity;

    public int calculatePrice() {
        return price * quantity;
    }
}
