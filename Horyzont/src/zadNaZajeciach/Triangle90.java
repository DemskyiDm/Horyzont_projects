package zadNaZajeciach;

import java.util.Scanner;

public class Triangle90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>0 && b>0 &&c>0 && (a*a+b*b)==c*c || (a*a+c*c)==b*b || (c*c+b*b)==a*a) {
            System.out.println("trojkat prostokotny");
        }else {
            System.out.println("nie mozna utworzyc prostokatny trojkat");
        }

    }
}
