package tablice;

import java.util.Scanner;

public class Zad1_Los_z_zakresu {
    public static void rand(int min, int max) {
        max -= min;
        System.out.println((int) (Math.random() * ++max) + min);
    }

    public static void scanner() {
        Scanner sc = new Scanner(System.in);
        System.err.println("Wprowadz min:");
        int min = sc.nextInt();
        System.err.println("Wprowadz max:");
        int max = sc.nextInt();
        rand(min, max);
    }

    public static void main(String[] args) {
        scanner();
    }
}
