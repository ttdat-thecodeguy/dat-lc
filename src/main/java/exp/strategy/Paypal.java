package exp.strategy;

public class Paypal implements PaymentStrategy {

    private static volatile Paypal PAYPAL;

    static {
        try {
            PAYPAL = new Paypal();
        } catch (Exception ignored) {}
    }

    public static Paypal getInstance() {
        if (PAYPAL == null) {
            PAYPAL = new Paypal();
        }
        return PAYPAL;
    }

    // setiing
    private Paypal () {}

    @Override
    public void pay(double amount) {
        System.out.println("Payment " + amount + " With Paypal");
    }
}
