package zadNaZajeciach.Losowanie;

import java.util.HashSet;
import java.util.Random;

public class Zad4a {
    public static void main(String[] args) {

        Random rand = new Random();
        HashSet<Integer> numbers = new HashSet<Integer>();

        while (numbers.size() < 6) {
            numbers.add(rand.nextInt(49) + 1);
        }

        System.out.println(numbers);
    }
}
