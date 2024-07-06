package exp.strategy;

import java.util.ArrayList;
import java.util.List;

public class BankingSystem {
  public static void main(String[] args) {
    List<PaymentStrategy> strategies = new ArrayList<>();
    strategies.add(Credit.getInstance());
    strategies.add(Paypal.getInstance());
    PaymentService paymentService = new PaymentService(strategies);
    paymentService.process("Credit", 10);
  }
}
