package zadNaZajeciach;

import java.util.Scanner;

public class MinMax {
    public static void minmaxvoid (int a, int b, int c) {
        if (a < b && a < c && b < c) {
            System.out.println(a + "," + b + "," + c);
        } else if (a < b && a < c && c < b) {
            System.out.println(a + "," + c + "," + b);
        } else if (b < a && b < c && a < c) {
            System.out.println(b + "," + a + "," + c);
        } else if (b < a && b < c && c < a) {
            System.out.println(b + "," + c + "," + a);
        } else if (c < a && c < b && b < a) {
            System.out.println(c + "," + b + "," + a);
        } else if (c < a && c < b && a < b) {
            System.out.println(c + "," + a + "," + b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        minmaxvoid(a,b,c);
    }
}
