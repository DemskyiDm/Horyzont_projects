package podstawy.zadania2a;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Wprowadż rok");
        int a = sc.nextInt();
        System.err.println("Wprowadż numer miesiąca");
        int b = sc.nextInt();
        if (b<1||b>13) {
            System.out.println("Wprowadzono błędny numer miesiaca");
        } else if (b==1||b==3||b==5||b==7||b==8||b==10||b==12) {
            System.out.println("Ilosc dzni w miesiącu = 31");
        } else if(b==4||b==6||b==9||b==11) {
            System.out.println("Ilosc dzni w miesiącu = 30");
        } else if (a%4 == 0 && b==2) {
            System.out.println("Ilosc dzni w miesiącu = 29");
        } else {
            System.out.println("Ilosc dzni w miesiącu = 28");
        }
    }
}
