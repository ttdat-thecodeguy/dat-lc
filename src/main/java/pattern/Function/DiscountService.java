package pattern.Function;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class DiscountService {
    private Map<String , Function<Double, Double>> strategies = new HashMap<>();

    public DiscountService () {
        strategies.put("SUMMER" , price -> price * 0.8 );
        strategies.put("WINTER", price -> price * 0.9);
    }

    public double apply (String code, double price ) {
        return strategies.getOrDefault(code, Function.identity()).apply(price);
    }
}
