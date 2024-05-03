package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        // 검증 로직
        if(itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        // 실행 로직
        items[itemCount] = item;
        itemCount++;

    }

    public void displayItems() {
        for(int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice() + "원");
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice() + "원");
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for(int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
