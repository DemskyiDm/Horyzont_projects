package Petle;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Wprowadz poczatek przedziału");
        int a = sc.nextInt();
        System.err.println("Wprowadz zakonczenie przedziału");
        int b = sc.nextInt();
        for (int c = a;c<=b;c++) {
            System.out.print(c+" ");
        }
    }
}
