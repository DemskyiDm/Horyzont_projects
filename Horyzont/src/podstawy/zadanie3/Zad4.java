package podstawy.zadanie3;

import java.util.Scanner;

public class Zad4 {
    public static void checkNumbers(int n, int k) {
        if (n > 0 && k > n) {
            throw new IllegalArgumentException("Brak mozliwosci wyliczenia współczynnika dwumianowego za wskazanymi parametrami");
        }
    }

    public static int binomial(int ratio) {
        if (ratio == 1 || ratio == 0) {
            return 1;
        }
        return ratio * binomial(ratio - 1);
    }

    private static void binomialTheorem(int n, int k) {
        System.out.println(binomial(n) / binomial(k) / binomial(n - k));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.err.println("Wprowadz liczbe n");
        int n = sc.nextInt();
        System.err.println("Wprowadz liczbe k");
        int k = sc.nextInt();
        checkNumbers(n, k);
        binomialTheorem(n, k);
    }
}