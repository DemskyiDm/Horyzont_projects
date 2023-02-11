package zadNaZajeciach;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();
        int b = sc.nextInt();

        if (a>0 && b>0 &&c>0 && (a+ c)>b && (c +b)>a && (a+b)> c) {
            System.out.println("Trójkąt istnieje");
        } else {
            System.out.println("Nie można utworzyć trójkąt");
        }

    }
}
