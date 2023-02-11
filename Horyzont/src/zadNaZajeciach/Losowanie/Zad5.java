package zadNaZajeciach.Losowanie;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Zad5 {

    public static void main(String[] args) {
        int[] numbersUsers = new int[6];
        Scanner sc = new Scanner(System.in);
        int numberOfTable;
        for (int i = 0; i < 6; i++) {
            System.err.println("wpisz " + (i + 1) + " liczbe w zakresie od 1 do 49");
            numberOfTable = sc.nextInt(); //
            numbersUsers[i] = numberOfTable; //new number in table
            for (int j = i - 1; j >= 0; j--) {
                while (numbersUsers[i] == numbersUsers[j] || numberOfTable <= 0 || numberOfTable > 49) { //check on copy or 0..49
                    System.err.println("wpisz ponownie " + (i + 1) + " liczbe w zakresie od 1 do 49");
                    numberOfTable = sc.nextInt();
                    numbersUsers[i] = numberOfTable;
                }
            }
        }

        boolean equalsNumbers;
        long numberOfAttemps = 0L;
        int checking = 0;
        while (checking < 1) {
            int year;
            int days;
            int[] tableForRandom = ranLos(6);
            numberOfAttemps++;
            equalsNumbers = Arrays.equals(tableForRandom, numbersUsers);
            if (equalsNumbers) {
                checking++;
                year = (int) numberOfAttemps / 365;
                days = (int) numberOfAttemps - year * 365;
                System.out.println("Liczby beda wylosowane po " + year + " latach i " + days + " dni");
                System.out.println(Arrays.toString(tableForRandom));
                System.out.println(Arrays.toString(numbersUsers));
                System.out.println(numberOfAttemps);
            }
        }

    }

    public static int[] ranLos(int y) {
        int[] numbersLos = new int[y];
        Random rand = new Random();
        int number_R;

        for (int i = 0; i < 6; i++) {
            number_R = rand.nextInt(49) + 1; // random from 1 to 49
            numbersLos[i] = number_R; //new number in table
            for (int j = i - 1; j >= 0; j--) {
                while (numbersLos[i] == numbersLos[j] || number_R <= 0 || number_R > 49) { //check on copy or 0..49
                    // System.err.println("losuj ponownie " + (i + 1) + " liczbe w zakresie od 1 do 49");
                    number_R = rand.nextInt(49) + 1; // random from 1 to 49
                    numbersLos[i] = number_R; //new number in table
                }
            }
        }
        return numbersLos;
    }
}




