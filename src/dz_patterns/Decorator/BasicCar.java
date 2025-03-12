package dz_patterns.Decorator;

public class BasicCar implements Car {
    @Override
    public String getDescription() {
        return "Базовый автомобиль";
    }

    @Override
    public int cost() {
        return 2000000; // Цена базового автомобиля
    }
}
