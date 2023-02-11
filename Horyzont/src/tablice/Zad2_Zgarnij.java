package tablice;

import java.util.Random;
import java.util.Scanner;

public class Zad2_Zgarnij {
    public static int rand() {
        Random rand = new Random();
        int number = rand.nextInt(100);
        return number;
    }

    public static int scanner() {
        Scanner sc = new Scanner(System.in);
        System.err.println("Wprowadz swoja liczbe od 0 do 100");
        return sc.nextInt();
    }

    public static void round(int number) {
        int n = 0;
        boolean result = false;
        while (!result) {
            int numberGamer = scanner();
            n++;
            if (numberGamer > number) {
                System.out.println("za duzo");
            } else if (numberGamer < number) {
                System.out.println("za malo");
            } else {
                System.out.println("Odgadales liczbe " + number + " liczba prob " + n);
                result = true;
            }
        }
    }

    public static void main(String[] args) {
        round(rand());
    }
}
