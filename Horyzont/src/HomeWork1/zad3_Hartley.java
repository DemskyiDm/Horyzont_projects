package HomeWork1;

import java.util.Random;

public class zad3_Hartley {
    public static void main(String[] args) {
        Random R1 = new Random();
        double p = R1.nextDouble();
        double l = Math.log(1 / p) / Math.log(2);

        System.out.printf("Ilość bitów informacji związanej z tym zdarzeniem l(%.3f): %.3f", p, l);

    }
}
