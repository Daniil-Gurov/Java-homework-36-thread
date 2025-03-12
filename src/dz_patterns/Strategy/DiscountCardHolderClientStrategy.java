package dz_patterns.Strategy;

public class DiscountCardHolderClientStrategy implements DiscountStrategy {
    @Override
    public int discount() {
        return 15;
    }
}
