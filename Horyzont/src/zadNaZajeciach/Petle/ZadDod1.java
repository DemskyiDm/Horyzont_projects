package zadNaZajeciach.Petle;

public class ZadDod1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("podzielne przez 2, podzielne przez 3");
            } else if (i % 2 == 0) {
                System.out.println("podzielne przez 2");
            } else if (i % 3 == 0) {
                System.out.println("podzielne przez 3");
            } else {
                System.out.println(i);
            }
        }
    }

}


