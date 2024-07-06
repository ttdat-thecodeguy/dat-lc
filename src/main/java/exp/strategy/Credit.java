package exp.strategy;

public class Credit implements PaymentStrategy {

    // volatile variables will support for multi thread
    private static volatile Credit CREDIT;

    private Credit() {}

    static {
        try {
            CREDIT = new Credit();
        } catch (Exception ignored) {}
    }


    public static Credit getInstance() {
        if (CREDIT == null) {
            CREDIT = new Credit();
        }
        return CREDIT;
    }


    @Override
    public void pay(double amount) {
        System.out.println("Payment " + amount + " With Credit card" );
    }
}


