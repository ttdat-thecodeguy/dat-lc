package pattern.Enums;

public class OrderService {
    public void processHandle (OrderStatus status) {
        status.handle();
    }
}
