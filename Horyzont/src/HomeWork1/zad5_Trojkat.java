package HomeWork1;

import java.util.Scanner;

public class zad5_Trojkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Wprowadż długość strony a ");
        double a = sc.nextDouble();
        System.err.println("Wprowadż długość strony b ");
        double b = sc.nextDouble();
        System.err.println("Wprowadż długość strony c ");
        double c = sc.nextDouble();
        if ((a+b)>c && (b+c)>a && (c+a)>b) {
            System.out.println("Dane spełniają nierówność trójkąta");
            double perimetr = (a+b+c)/2;
            System.out.printf("Obwód trójkąta wynosi %.3f%n", perimetr*2);
            double area = Math.sqrt(perimetr*(perimetr-a)*(perimetr-b)*(perimetr-c));
            System.out.printf("Pole trójkąta wynosi %.3f%n", area);
        } else {
            System.out.println("Dane nie spełniają nierówność trójkąta");
        }
        sc.close();
    }

}
