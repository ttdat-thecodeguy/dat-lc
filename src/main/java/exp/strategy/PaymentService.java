package exp.strategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentService {
    private final Map<String, PaymentStrategy> paymentStrategies;

    public PaymentService (List<PaymentStrategy> strategies) {
        paymentStrategies = new HashMap<>();
        for (PaymentStrategy paymentStrategy : strategies) {
            paymentStrategies.put(paymentStrategy.getClass().getSimpleName(), paymentStrategy);
        }
    }

    public void process(String payment, int amount) {
        PaymentStrategy strategy = paymentStrategies.get(payment);
        if (strategy == null) {
            System.out.println("No payment support with: " + payment);
            return;
        }
        System.out.println("[log] payment with: " + payment + " with amount:  " + amount);
        strategy.pay(10);
        System.out.println("[log] payment successfully. ");
    }

}
