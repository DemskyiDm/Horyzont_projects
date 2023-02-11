package Petle;

public class zad4 {
    public static void podzPrzez3() {
        System.out.println("Liczby od 1 do 100 podzielone na 3 bez reszty");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void podzPrzez5() {
        System.out.println("Liczby od 1 do 100 podzielone na 5 bez reszty");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void podzPrzez3_i_5() {
        System.out.println("Liczby od 1 do 100 podzielone na 3 i 5 bez reszty");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void podzPrzez3_lub_5() {
        System.out.println("Liczby od 1 do 100 podzielone na 3 lub 5 bez reszty");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        podzPrzez3();
        podzPrzez5();
        podzPrzez3_i_5();
        podzPrzez3_lub_5();
    }
}

