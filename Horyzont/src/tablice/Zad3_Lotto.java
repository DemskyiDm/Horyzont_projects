package tablice;

import java.util.Arrays;
import java.util.Random;

public class Zad3_Lotto {
    public static void main(String[] args) {
        Random rand = new Random();
        int numbers[] = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(49) + 1;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
