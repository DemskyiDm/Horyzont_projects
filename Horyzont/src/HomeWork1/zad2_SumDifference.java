package HomeWork1;

import java.util.Locale;
import java.util.Scanner;

public class zad2_SumDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.err.println("Wpisz sumę liczb rzeczywistych:");
        double sum = sc.nextDouble();
        System.err.println("Wpisz różnicę liczb rzeczywistych:");
        double difference = sc.nextDouble();
        double a = (sum + difference) / 2;
        double b = sum - a;
        System.out.printf("Pierwsa liczba rzeczywista to %.2f, druga liczba rzeczywista to %.2f", a, b);
        sc.close();
    }
}
