package HomeWork1;

import java.util.Scanner;

public class zad4_Wielokat {
    public static double more2(double amount) {
        double sumAngles = 180 * (amount - 2) / amount;
        System.out.printf("Dla n = %.0f, kąt pomiędzy bokami wyniesie %.2f°.", amount, sumAngles);
        return sumAngles;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Wpisz ilość stron wielokąta:");
        double amount = sc.nextDouble();
        if (amount > 2) {
            more2(amount);
        } else {
            System.err.println("U wielokąta ma być więcje niż 2 strony. Spróbuje jeszcze raz.");
            double amount1 = sc.nextDouble();
            more2(amount1);
        }
        sc.close();
    }
}
