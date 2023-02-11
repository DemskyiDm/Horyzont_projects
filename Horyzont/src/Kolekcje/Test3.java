package Kolekcje;

public class Test3 {
    public static void main(String[] args) {
        int j;
        for (int i = 1; i < 3; i++) {
            j = 0;
            for (;;) {
                if (j > 1) System.out.println(i * j);
                if (j > 2) break;
                j++;
            }
        }
    }
}
