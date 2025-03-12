package dz_patterns.Decorator;

public class MusicSystemDecorator extends CarDecorator {
    public MusicSystemDecorator(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return decoratedCar.getDescription() + ", музыкальная система";
    }

    @Override
    public int cost() {
        return decoratedCar.cost() + 50000; // Стоимость навигационной системы
    }
}
