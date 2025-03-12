package dz_patterns.Proxy;

import java.time.LocalDate;

interface DateProvider { // Интерфейс для получения текущей даты
    LocalDate getCurrentDate();
}

class RealDateProvider implements DateProvider { // Реальный объект, который возвращает текущую дату
    public LocalDate getCurrentDate() {
        return LocalDate.now();
    }
}

class ProxyDateProvider implements DateProvider { // Прокси, который кэширует текущую дату
    private RealDateProvider realDateProvider;
    private LocalDate cachedDate;

    public ProxyDateProvider() {
        this.realDateProvider = new RealDateProvider();
    }

    public LocalDate getCurrentDate() {
        if (cachedDate == null) { // Если дата еще не кэширована, получаем ее от реального объекта
            cachedDate = realDateProvider.getCurrentDate();
        }
        return cachedDate;
    }
}


public class ProxyPattern {
    public static void main(String[] args) {
        DateProvider dateProvider = new ProxyDateProvider();

        System.out.println("Текущая дата: " + dateProvider.getCurrentDate()); // Получаем текущую дату

        System.out.println("Текущая дата (из кэша): " + dateProvider.getCurrentDate()); // Повторный вызов, возвращает кэшированное значение
    }
}
