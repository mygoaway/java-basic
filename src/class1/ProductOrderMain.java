package class1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "상품명 1번";
        productOrder1.price = 1500;
        productOrder1.quantity = 2;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "상품명 2번";
        productOrder2.price = 2000;
        productOrder2.quantity = 3;

        ProductOrder[] productOrders = {productOrder1, productOrder2};
        int totalAmount = 0;
        for (ProductOrder productOrder : productOrders) {
            totalAmount += productOrder.calculatePrice();
        }
        System.out.println("최종 결제 금액 : " + totalAmount);
    }
}
