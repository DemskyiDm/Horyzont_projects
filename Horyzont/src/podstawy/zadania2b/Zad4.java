package podstawy.zadania2b;

import java.util.Scanner;

public class Zad4 {
    public static void upperPart(int height, int height_2) {
        for (int y = 1; y <= height; y++) { //lines
            for (int x = 1; x <= height_2; x++) {
                if (x >= (height - y + 1) && x <= ((height + y) - 1)) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void lowerPart(int height, int height_2) {
        for (int y = 1; y < height; y++) { //lines
            for (int x = 1; x <= height_2; x++) {
                if (x > y && x <= (height_2 - y)) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Wprowadz liczbe");
        int height = sc.nextInt();
        int height_2 = (height * 2) - 1;
        upperPart(height, height_2);
        lowerPart(height, height_2);
    }
}