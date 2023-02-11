package podstawy.zadania2b;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Wprowadz liczbe");
        int number = sc.nextInt();
        int numberOfDigits = 0;
        System.out.print("dla wartości n = " + number +" liczba cyfr użytych do zapisania liczby " + number + " to ");
        do {
            numberOfDigits++;
            number = number / 10;
        }
        while (number != 0);
        System.out.println(numberOfDigits);

    }
}

