package exp.strategy;

public class Paypal implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Payment " + amount + " With Paypal");
    }
}
