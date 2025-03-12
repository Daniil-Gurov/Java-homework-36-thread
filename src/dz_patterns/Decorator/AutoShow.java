package dz_patterns.Decorator;

public class AutoShow {
    public static void main(String[] args) {
        Car car = new BasicCar();
        System.out.println(car.getDescription() + " $" + car.cost());

        car = new MusicSystemDecorator(car);
        System.out.println(car.getDescription() + " $" + car.cost());

        car = new LeatherSeatsDecorator(car);
        System.out.println(car.getDescription() + " $" + car.cost());
    }
}
