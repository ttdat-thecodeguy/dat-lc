package pattern.Enums;

public enum OrderStatus {
    NEW {
        @Override
        public void handle() {
            System.out.println("Order Created");
        }
    },
    SHIPPED {
        @Override
        public void handle() {
            System.out.println("Order shipped");
        }
    },
    DELIVERED {
        @Override
        public void handle() {
            System.out.println("Order Delivered");
        }
    };
    public abstract void handle();
}
