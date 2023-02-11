package podstawy.zadania2b;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Wprowadz liczbe");
        int number = sc.nextInt();
        int degree = -1;
        int result = 0;
        while (number > result) {


            degree++;
            int a = 2;
            result = (int) Math.pow(a, degree);

            if (number == result) {
                break;
            } else if (result > number) {
                degree--;
                result = (int) Math.pow(a, degree);
                break;
            }

        }
        System.out.println(" dla wartości n = " + number + " największą potęgą 2 nie większą od n jest " + result + " = " + "2^" + degree);
    }
}
