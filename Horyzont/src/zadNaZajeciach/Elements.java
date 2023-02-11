package zadNaZajeciach;

import java.util.Scanner;

public class Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("wprowadz a");
        double a = sc.nextDouble();
        System.err.println("wprowadz b");
        double b = sc.nextDouble();
        System.err.println("wprowadz c");
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;

        if (d < 0) {
            System.out.println("brak rozwizania");
        } else if (d == 0) {
            double e1 = -b / (2 * a);
            System.out.printf("Pierwiastek stanowi %.2f", e1);
        } else {
            double e1 = ((-b + Math.sqrt(d)) / (2 * a));
            double e2 = ((-b - Math.sqrt(d)) / (2 * a));
            System.out.printf("Pierwiastki stanowia %.2f i %.2f", e1, e2);
        }

    }

}
