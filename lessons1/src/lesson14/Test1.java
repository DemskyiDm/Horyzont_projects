package lesson14;

public class Test1 {
    public static void main(String[] args) {
        OUTER:
        for (int i = 1; i < 5; i++) {
            INNER:
            for (int j = 1; j < 5; j++) {
                if (j == 2) {
                    System.out.println(j);
                    break OUTER;

                }
                System.out.println("Lesson #14");
            }

        }
    }
}