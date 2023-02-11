package podstawy.zadanie3;

import java.util.Scanner;

public class Zad2 {
    public static boolean checkNumbers(int n, int p) {
        if (n < 0 || p < 1) {
            throw new IllegalArgumentException("Wprowadzone dane sa ujemne");
        }
        return true;
    }

    private static void logarytm(int n, int p) {
        int logDyskr = 0;
        System.out.print("Logarytm dyskretny z wartoscia logarytmowana n = " + n + " i podstawa logarytmu p =  " + p);
        do {
            n = n / p;
            logDyskr++;
            }
        while (n >= p);
        System.out.println( " wynosi " + logDyskr);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Wpisz wartosc logarytmowana");
        int n = sc.nextInt();
        System.err.println("Wpisz podstawe logarytmu");
        int p = sc.nextInt();
        checkNumbers(n,p);
        logarytm(n, p);
    }
}
