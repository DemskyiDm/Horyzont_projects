package zadNaZajeciach.Petle;

public class ZadDod1_without_if {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            OUTER:
            switch (i % 2) {
                case 0:
                    switch (i % 3) {
                        case 0:
                            System.out.println("podzielne przez 2, podzielne przez 3");
                            break OUTER;
                    }
                    System.out.println("podzielne przez 2");
                    break OUTER;
                case 1:
                    switch (i % 3) {
                        case 0:
                            System.out.println("podzielone przez 3");
                            break OUTER;
                        case 1:
                            System.out.println(i);
                            break OUTER;
                        case 2:
                            System.out.println(i);
                            break OUTER;
                    }
            }
        }
    }
}
