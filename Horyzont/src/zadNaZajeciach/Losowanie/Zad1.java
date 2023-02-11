package zadNaZajeciach.Losowanie;

import java.util.Random;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Wprowadz min:");
        int min = sc.nextInt();
        System.err.println("Wprowadz max:");
        int max = sc.nextInt();
        int rnd = rand(min, max);
        System.out.println(rnd);


    }

    static int rand(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
