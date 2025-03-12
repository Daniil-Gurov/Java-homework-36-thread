package dz_patterns.Decorator;

public class CarDecorator implements Car{
    protected Car decoratedCar;

    public CarDecorator(Car car) {
        this.decoratedCar = car;
    }

    @Override
    public String getDescription() {
        return decoratedCar.getDescription();
    }

    @Override
    public int cost() {
        return decoratedCar.cost();
    }
}
