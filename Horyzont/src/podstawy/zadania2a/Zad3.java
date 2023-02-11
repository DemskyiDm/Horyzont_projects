package podstawy.zadania2a;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Wprowadż rok");
        int a = sc.nextInt();
        int b = a % 12;
        switch (b) {
            case (1):
                System.out.println("kogut");
                break;
            case (2):
                System.out.println("pies");
                break;
            case (3):
                System.out.println("swinia");
                break;
            case (4):
                System.out.println("szczur");
                break;
            case (5):
                System.out.println("bawol");
                break;
            case (6):
                System.out.println("tygrys");
                break;
            case (7):
                System.out.println("krolik");
                break;
            case (8):
                System.out.println("smok");
                break;
            case (9):
                System.out.println("waz");
                break;
            case (10):
                System.out.println("kon");
                break;
            case (11):
                System.out.println("koza");
                break;
            default:
                System.out.println("malpa");
                break;
        }
    }
}
