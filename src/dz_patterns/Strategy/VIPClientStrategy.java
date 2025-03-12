package dz_patterns.Strategy;

public class VIPClientStrategy implements DiscountStrategy {
    @Override
    public int discount() {
        return 30;
    }
}
