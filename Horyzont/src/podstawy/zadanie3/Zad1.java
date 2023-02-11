package podstawy.zadanie3;

import java.util.Scanner;

public class Zad1 {

    public static double delta(double a, double b, double c)  {
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            throw new IllegalArgumentException("delta jest ujemna");
        }
        return delta;
    }

    private static void signum(double a, double b, double c) {
        double x1 = ((b*(-1) - Math.sqrt(delta(a, b, c))) / (2*a));
        double x2 = ((b*(-1) + Math.sqrt(delta(a, b, c))) / (2*a));
        System.out.printf("Wartość x1 = %.3f\n", x1);
        System.out.printf("Wartość x2 = %.3f", x2);
    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.err.println("Wprawadz współczynnik rzeczywisty a");
        double a = sc.nextDouble();
        System.err.println("Wprawadz współczynnik rzeczywisty b");
        double b = sc.nextDouble();
        System.err.println("Wprawadz współczynnik rzeczywisty c");
        double c = sc.nextDouble();
        signum(a, b, c);
    }
}
