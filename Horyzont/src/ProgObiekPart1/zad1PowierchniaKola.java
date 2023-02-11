package ProgObiekPart1;

import java.util.Scanner;

public class zad1PowierchniaKola {
    final static double Pi = 3.14159265358979323846;

    public static void powierchnia(double r) {
        double area = Pi * r * r;
        System.out.printf("Pole powierzchni %.3f %n", area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Wprowadż długość promienia kuli");
        powierchnia(sc.nextDouble());
        sc.close();
    }
}
