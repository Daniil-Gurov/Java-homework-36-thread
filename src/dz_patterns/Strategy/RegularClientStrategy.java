package dz_patterns.Strategy;

public class RegularClientStrategy implements DiscountStrategy{
    @Override
    public int discount() {
        return 0;
    }
}
