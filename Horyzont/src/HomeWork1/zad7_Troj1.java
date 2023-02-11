package HomeWork1;

import java.util.Scanner;

public class zad7_Troj1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Wprowadż długość boku a");
        double a = Math.abs(sc.nextDouble());
        System.err.println("Wprowadż długość boku b");
        double b = Math.abs(sc.nextDouble());
        double c = Math.sqrt(a*a+b*b);
        System.out.printf("Długość boku przeciwprostokątnego w trójkącie prostokątnym wynosi c = %.2f",c);
        sc.close();
    }
}
