package dz2;

import java.util.Calendar;

public final class JuiceBoxImmutableClass {
    private final String brand; //марка
    private final String flavor; //вкус
    private final int packingVolume; //объём, мл
    private final Calendar manufactureDate; //дата упаковки
    private final int shelfLife; //срок годности, в месяцах
    private final Calendar expirationDate; //годен до

    public JuiceBoxImmutableClass(String brand, String flavor, int packingVolume, Calendar manufactureDate, int shelfLife){
        this.brand = brand;
        this.flavor = flavor;
        this.packingVolume = packingVolume;
        this.manufactureDate = manufactureDate;
        this.shelfLife = shelfLife;
        Calendar tempExpirationDate = (Calendar) manufactureDate.clone();
        tempExpirationDate.add(Calendar.MONTH, shelfLife);
        this.expirationDate = tempExpirationDate;
    }

    public String getBrand() {
        return brand;
    }

    public String getFlavor() {
        return flavor;
    }

    public int getPackingVolume() {
        return packingVolume;
    }

    public Calendar getManufactureDate() {
        return (Calendar) manufactureDate.clone();
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public Calendar getExpirationDate() {
        return (Calendar) expirationDate.clone();
    }

    public static void main(String[] args) {
        JuiceBoxImmutableClass juiceBox = new JuiceBoxImmutableClass("Добрый", "Яблоко", 1000,
                Calendar.getInstance(), 12);
        System.out.println("Марка: " + juiceBox.getBrand());
        System.out.println("Вкус: " + juiceBox.getFlavor());
        System.out.println("Объём: " + juiceBox.getPackingVolume());
        System.out.println("Дата упаковки: " + juiceBox.getManufactureDate().getTime());
        System.out.println("Срок годности: " + juiceBox.getShelfLife() + " месяцев");
        System.out.println("Годен до: " + juiceBox.getExpirationDate().getTime());
    }
}
