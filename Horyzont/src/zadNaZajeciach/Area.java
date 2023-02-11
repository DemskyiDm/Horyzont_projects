package zadNaZajeciach;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        final double PI = 3.14;
        double area = r * r * PI;
        System.out.printf("Pole powierchni kuli stanowi %.3f", area);
    }
}
