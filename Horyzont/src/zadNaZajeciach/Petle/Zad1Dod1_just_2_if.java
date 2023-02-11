package zadNaZajeciach.Petle;

public class Zad1Dod1_just_2_if {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("podzielne przez 2, podzielne przez 3");
            } else if (i % 2 == 0) {
                System.out.println("podzielne przez 2");
            } else {
                String s = i % 3 == 0 ? "podzielone przez 3" : String.valueOf(i);
                System.out.println(s);
            }
        }
    }
}
