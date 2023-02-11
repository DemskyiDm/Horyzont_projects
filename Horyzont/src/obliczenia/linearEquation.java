package obliczenia;

import java.util.Locale;
import java.util.Scanner;

public class linearEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.err.println("Wpisz współczynnik rzeczywisty pierwszy: ");

        double a = sc.nextDouble();
        System.err.println("Wpisz współczynnik drugi pierwszy: ");
        double b = sc.nextDouble();
        double x = (-b) / a;
        System.out.printf("wartość X wynosi: %.3f%n", x);
    }
}
