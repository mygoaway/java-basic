package ref.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder [] productOrders = {
                createOrder("두부", 2000, 2),
                createOrder("김치", 5000, 1),
                createOrder("콜라", 1500, 2),
        };

        printOrders(productOrders);
        System.out.println("총 결제 금액: " + getTotalAmount(productOrders));
    }

    private static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    private static void printOrders(ProductOrder[] productOrders) {
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명 : " + productOrder.productName + ", 가격 : "+productOrder.price +  ", 수량 : "+productOrder.quantity);
        }
    }

    private static int getTotalAmount(ProductOrder[] productOrders) {
        int totalAmount = 0;
        for (ProductOrder productOrder : productOrders) {
            totalAmount += productOrder.price * productOrder.quantity;
        }
        return totalAmount;
    }
}
