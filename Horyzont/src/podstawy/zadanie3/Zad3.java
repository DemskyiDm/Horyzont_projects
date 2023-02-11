package podstawy.zadanie3;

import java.util.Scanner;

public class Zad3 {

    private static int lucasMethod(int n) {
        if (n == 0) {
            return 2;
        } else if (n == 1) {
            return 1;
        } else {
            return (lucasMethod(n - 1) + lucasMethod(n - 2));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.err.println("Wprowadz liczbe");
        int n = sc.nextInt();
        System.out.println(n + "-ta liczba Lucasa to " + lucasMethod(n));
    }
}
