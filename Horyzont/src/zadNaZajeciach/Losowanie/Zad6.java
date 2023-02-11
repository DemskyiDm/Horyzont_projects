package zadNaZajeciach.Losowanie;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


public class Zad6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> numbersUsers = new HashSet<Integer>();
        while (numbersUsers.size() < 6) {
            System.err.println("Wprowadz " + (numbersUsers.size() + 1) + " liczbe od 1 do 49");
            int a = sc.nextInt();
            numbersUsers.add(a);
        }

        boolean equalsNumbers = false;
        long numberOfAttemps = 0L;
        int checking = 0;
        while (checking < 1) {
            int year;
            int days;
            Set<Integer> tableForRandom = random(6);
            numberOfAttemps++;
            if (numbersUsers.equals(tableForRandom)) {
                checking++;
                year = (int) numberOfAttemps / 365;
                days = (int) numberOfAttemps - year * 365;
                System.out.println("Liczby beda wylosowane po " + year + " latach i " + days + " dni");
                System.out.println(tableForRandom);
                System.out.println(numbersUsers);
                System.out.println(numberOfAttemps);
            }
        }
    }

    public static Set<Integer> random(int y) {
        Set<Integer> numbers = new HashSet<Integer>();
        Random r = new Random();
        while (numbers.size() < y) {
            numbers.add(r.nextInt(49) + 1);
        }
        return numbers;
    }
}

