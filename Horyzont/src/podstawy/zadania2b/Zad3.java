package podstawy.zadania2b;

import java.util.Scanner;


public class Zad3 {

    public static void lengthOfNumber(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Wprowadz liczbe");
        int number = sc.nextInt();
        lengthOfNumber(number);
    }
}

