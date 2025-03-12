package dz2;

import java.util.Scanner;

public final class RectangleHelper {

    private RectangleHelper(){
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static boolean SidesChecking(int a, int b, int c, int d){ //Проверка сторон
        if (a == c && b == d && a > 0 && b > 0 && c > 0 && d > 0){
            return true;
        } else {
            return false;
        }
    }

    public static int Perimeter(int a, int b, int c, int d){ //Периметр
        if (SidesChecking(a, b, c, d)){
            return a + b + c + d;
        } else {
            throw new IllegalArgumentException("Числа меньше нуля или противоположные стороны данного прямоугольника имеют разную длину");
        }
    }

    public static int Area(int a, int b, int c, int d){ //Площадь
        if (SidesChecking(a, b, c, d)){
            return a*b;
        } else {
            throw new IllegalArgumentException("Числа меньше нуля или противоположные стороны данного прямоугольника имеют разную длину");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стороны прямоугольника через пробел");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println("Периметр: " + RectangleHelper.Perimeter(a, b, c, d));
        System.out.println("Площадь: " + RectangleHelper.Area(a, b, c, d));
        scanner.close();
    }
}
