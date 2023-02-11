package podstawy.zadania2a;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Wprowadż godzine");
        int a = sc.nextInt();
        switch (a) {
            case 4:
            case 5:
                System.out.println("swit");
                break;
            case 6:
            case 7:
                System.out.println("rano");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("przedpoludnie");
                break;
            case 11:
            case 12:
            case 13:
                System.out.println("poludnie");
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println("popoludnie");
                break;
            case 18:
            case 19:
            case 20:
            case 21:
                System.out.println("wiecor");
                break;
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("noc");
                break;
        }

    }
}