package Lesson5;

public class Lesson5a {
    int sum(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    int sredarif(int a1, int b1, int c1) {
        int result2 = sum (a1, b1, c1)/3;
        return result2;
    }
}
class test21 {
    public static void main (String[] args) {
        Lesson5a t21 = new Lesson5a();
        int sum3cz = t21.sum(1,2,3);
        System.out.println(sum3cz);
        System.out.println(t21.sum(3,5,7));
        System.out.println(t21.sredarif(4,6,8));
    }
}
