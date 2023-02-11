package zadNaZajeciach.Losowanie;

import java.util.Arrays;
import java.util.Random;

public class Zad4 {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        Random rand = new Random();
        int number_R;

        for (int i = 0; i < 6; i++) {
            number_R = rand.nextInt(49) + 1; // random from 1 to 49
            numbers[i] = number_R; //new number in table
            for (int j = i - 1; j >= 0; j--) {
                while (numbers[i] == numbers[j] || number_R <= 0 || number_R > 49) { //check on copy or 0..49
                    // System.err.println("losuj ponownie " + (i + 1) + " liczbe w zakresie od 1 do 49");
                    number_R = rand.nextInt(49) + 1; // random from 1 to 49
                    numbers[i] = number_R; //new number in table
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
