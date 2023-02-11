package zadNaZajeciach.Losowanie;

import java.util.Arrays;
import java.util.Random;

public class Zad3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int numbers[] = new int[6];
        numbers[0] = rand.nextInt(49) + 1;
        numbers[1] = rand.nextInt(49) + 1;
        numbers[2] = rand.nextInt(49) + 1;
        numbers[3] = rand.nextInt(49) + 1;
        numbers[4] = rand.nextInt(49) + 1;
        numbers[5] = rand.nextInt(49) + 1;
        System.out.println(Arrays.toString(numbers));

    }
}
