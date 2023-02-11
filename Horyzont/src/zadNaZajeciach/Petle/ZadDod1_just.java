package zadNaZajeciach.Petle;

public class ZadDod1_just {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

            String c = "podzielne przez 2, podzielne przez 3";
            String a = "podzielone przez 2";
            String b = "podzielone przez 3";

            String s = (i % 2 == 0 && i % 3 == 0) ? c : (i % 2 == 0) ? a : i % 3 == 0 ? b : String.valueOf(i);
            System.out.println(s);

        }
    }
}
