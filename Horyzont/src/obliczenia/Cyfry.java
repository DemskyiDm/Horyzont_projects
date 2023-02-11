package obliczenia;

import java.util.Scanner;

public class Cyfry {
    public static void main(String[] args) {
        System.err.println("Wpisz nową cyfrę");
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        System.out.println("Liczba całkowita to " + digit + ".");
        int unity = digit%10;
        System.out.println("Cyfra jedności to " + unity + ".");
        int tens = digit / 10 % 10;
        System.out.println("Cyfra dziesiątek to " + tens + ".");
        int hundreds = digit / 100;
        System.out.println("Cyfra setek to " + hundreds + ".");
        sc.close();
    }

}
