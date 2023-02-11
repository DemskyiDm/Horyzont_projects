package ProgObiekPart1;

import java.util.Scanner;

public class zad6_RectangularTriangle {

    public static double maxLengthSide(double a, double b, double c) {
        if (a >= b && a >= c) {
            return a;
        }
        return Math.max(b, c);
    }

    public static double sumOfSquares(double a, double b, double c) {
        return a * a + b * b + c * c;
    }

    public static double sumOfMaxSquares(double a, double b, double c) {
        return maxLengthSide(a, b, c) * maxLengthSide(a, b, c);
    }

    public static boolean checkTriangle(double a, double b, double c) {
        if (a < 0 || b < 0 || c < 0) {
            return false;
        }
        return a + b + c > 2 * maxLengthSide(a, b, c);
    }

    public static boolean rectangularTriangle(double a, double b, double c) {
        return sumOfSquares(a, b, c) == 2 * sumOfMaxSquares(a, b, c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Wprowadż długość a");
        double a = sc.nextDouble();
        System.err.println("Wprowadż długość b");
        double b = sc.nextDouble();
        System.err.println("Wprowadż długość c");
        double c = sc.nextDouble();

        if (checkTriangle(a, b, c)) {
            if (rectangularTriangle(a, b, c)) {
                System.out.println("trojkat prostokatny");
            } else {
                System.out.println("trojkat nie jest prostokątnym");
            }
        } else {
            System.out.println("Trojkant nie istnieje");
        }
    }
}
