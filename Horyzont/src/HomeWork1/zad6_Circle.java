package HomeWork1;

import java.util.Scanner;

public class zad6_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Wprowadż długość promienia kuli");
        double r = sc.nextDouble();
        final double Pi = 3.14159265358979323846;
        double area = 4.0 * Pi * r * r;
        double volume = (4.0 / 3.0) * Pi * r * r * r;
        System.out.printf("Objętość kuli wynosi %.3f i pole powierzchni %.3f %n", volume, area);
        System.out.println(volume);
        System.out.println(area);
        sc.close();
    }
}
