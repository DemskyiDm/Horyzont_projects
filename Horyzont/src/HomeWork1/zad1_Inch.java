package HomeWork1;

import java.util.Locale;
import java.util.Scanner;

public class zad1_Inch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.err.println("Wpisz liczbę cali");
        double inch = sc.nextInt();
        double mm = inch * 25.4;
        System.out.printf("Długość w %.2f\" wynosi %.3f mm ", inch, mm);
        sc.close();
    }
}
