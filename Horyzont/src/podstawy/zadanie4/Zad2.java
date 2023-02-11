package podstawy.zadanie4;

import java.util.Scanner;

public class Zad2 {
    private static void checkNumbers(int n) {
        if (n < 1 || n > 12) {
            throw new IllegalArgumentException("Wprowadz dane od 1 do 12");
        }
    }

    private static int binomial(int ratio) {
        if (ratio == 1 || ratio == 0) {
            return 1;
        }
        return ratio * binomial(ratio - 1);
    }

    private static int binomialTheorem(int n, int k) {
        return binomial(n) / binomial(k) / binomial(n - k);
    }

    private static void tablePascal(int n) {
        int[][] table = new int[n + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            int numberOfSymbol = n + 20 - 2 * i;
            while (numberOfSymbol > 0) {
                numberOfSymbol--;
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                table[i][j] = binomialTheorem(i, j);
                System.out.printf("% ,-4d", table[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Wprowadz liczbe");
        int n = sc.nextInt();
        checkNumbers(n);
        tablePascal(n);
    }
}

