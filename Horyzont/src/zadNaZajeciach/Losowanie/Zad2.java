package zadNaZajeciach.Losowanie;

import java.util.Random;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(5);
        int n = 0;
        boolean result = false;
        while (!result) {
            Scanner sc = new Scanner(System.in);
            System.err.println("Wprowadz swoja liczbe od 0 do 100");
            int numberGamer = sc.nextInt();
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
}
