package podstawy.zadanie3;

import java.util.Scanner;

public class Zad5 {

    public static void checkNumbers(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Liczby ujemne");
        }
    }

    public static int nwd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return nwd(b, a % b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.err.println("Wprowadz liczbe a");
        int a = sc.nextInt();
        System.err.println("Wprowadz liczbe b");
        int b = sc.nextInt();
        checkNumbers(a, b);
        System.out.println("NWD dla " + a + " i " + b + " wynosi " + nwd(a, b));
    }
}
