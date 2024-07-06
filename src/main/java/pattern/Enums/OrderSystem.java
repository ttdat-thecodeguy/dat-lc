package pattern.Enums;

public class OrderSystem {
    public static void main(String[] args) {
        OrderStatus delivered = OrderStatus.DELIVERED;
        OrderService service = new OrderService();
        service.processHandle(delivered);
    }
}
