package exp.strategy;

public class Credit implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Payment " + amount + " With Credit card" );
    }
}


