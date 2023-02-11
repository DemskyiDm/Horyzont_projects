package podstawy.zadanie4;

import java.util.Scanner;

public class Zad1 {
    private static void checkNumbers(int n) {
        if (n < 1 || n > 44) {
            throw new IllegalArgumentException("Wprowadz dane od 1 do 44");
        }
    }

    private static int scanner() {
        Scanner sc = new Scanner(System.in);
        System.err.println("Wprowadz liczbe");
        int n = sc.nextInt();
        checkNumbers(n);
        return n;
    }


    private static int lucasMethod(int i) {
        if (i == 0) {
            return 2;
        } else if (i == 1) {
            return 1;
        } else {
            return (lucasMethod(i - 1) + lucasMethod(i - 2));
        }
    }

    private static void tableWithLucas(int n) {
        int[] table = new int[n];
        for (int i = 0; i < n; i++) {
            table[i] = lucasMethod(i);
            System.out.print(table[i] + " ");
        }
    }

    public static void main(String[] args) {
        tableWithLucas(scanner());
    }
}

