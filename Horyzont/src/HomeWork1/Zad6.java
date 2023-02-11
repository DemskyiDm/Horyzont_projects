package HomeWork1;


import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


public class Zad6 {
    private static final Random RANDOM = new Random();
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Set<Integer> userNumbers = getUserNumbers();

        long attemptsCount = 0L;
        int checking = 0;
        while (checking < 1) {
            Set<Integer> tableForRandom = getRandomSet(6);
            attemptsCount++;
            if (userNumbers.equals(tableForRandom)) {
                checking = printCalculationResults(userNumbers, attemptsCount, checking, tableForRandom);
            }
        }
    }

    private static int printCalculationResults(Set<Integer> userNumbers, long attemptsCount, int checking, Set<Integer> tableForRandom) {
        checking++;
        int year = (int) attemptsCount / 365;
        int days = (int) attemptsCount - year * 365;
        System.out.println("Liczby beda wylosowane po " + year + " latach i " + days + " dni");
        System.out.println(tableForRandom);
        System.out.println(userNumbers);
        System.out.println(attemptsCount);
        return checking;
    }


    private static Set<Integer> getUserNumbers() {
        Set<Integer> userNumbers = new HashSet<>();
        while (userNumbers.size() < 6) {
            System.err.println("Wprowadz " + (userNumbers.size() + 1) + " liczbe od 1 do 49");
            userNumbers.add(SCANNER.nextInt());
        }
        return userNumbers;
    }

    private static Set<Integer> getRandomSet(int y) {
        Set<Integer> resultSet = new HashSet<Integer>();
        while (resultSet.size() < y) {
            resultSet.add(getRandomNumber());

        }
        return resultSet;
    }

    private static int getRandomNumber() {
        return RANDOM.nextInt(49) + 1;
    }

}
