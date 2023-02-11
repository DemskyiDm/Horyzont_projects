package zadNaZajeciach.Petle;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        //zad1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //zad2
        for (int i = 5; i <= 10; i++) {
            System.out.println(i);
        }
        //zad3
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        //zad4a
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        //zad4b
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        //zad4c
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
        //zad4d
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
        //zad5
        Scanner sc = new Scanner(System.in);
        System.err.println("wprowadz poczatek zakresu:");
        int a = sc.nextInt();
        System.err.println("wprowadz koniec zakresu:");
        int b = sc.nextInt();
        for (int c = a; c <= b; c++) {
            System.out.println(a);
        }

    }
}
