package ProgObiekPart1;

import java.util.Scanner;


public class zad3Glosowanie {
    public static void vote(int age) {
        if (age < 18) {
            System.out.println("nie możesz głosować");
        } else if (age >= 18 && age < 35) {
            System.out.println("możesz głosować, ale nie możesz zostać wybranym na prezydenta");
        } else {
            System.out.println("możesz kandydować na prezydenta państwa");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vote(sc.nextInt());
    }
}
