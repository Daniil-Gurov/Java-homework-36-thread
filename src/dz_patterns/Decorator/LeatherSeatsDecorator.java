package dz_patterns.Decorator;

public class LeatherSeatsDecorator extends CarDecorator {
    public LeatherSeatsDecorator(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return decoratedCar.getDescription() + ", кожаные сиденья";
    }

    @Override
    public int cost() {
        return decoratedCar.cost() + 50000; // Стоимость кожаных сидений
    }
}
