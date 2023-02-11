package lesson18;

import java.util.Arrays;

public class Test7HW {
    public static void sortirovka(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        int [] array1 = {1,3,6,9,3,2,3,7,9,3,1};
        sortirovka(array1);
    }
}
