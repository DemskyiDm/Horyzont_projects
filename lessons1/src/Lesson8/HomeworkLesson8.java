package Lesson8;

public class HomeworkLesson8 {

    static int method1(int a, int b, int c) {
        int result = a * b * c;
        return result;
    }

    static void method2(int a, int b) {
        System.out.println("Celoe chastnoe " + a / b);
        System.out.println("Ostatok ot delenia " + a % b);
    }
}

class HomeworkLesson8Test {
    public static void main(String[] args) {
        HomeworkLesson8.method1(3, 4, 5);
        HomeworkLesson8.method2(3, 4);
        HomeworkLesson8.method1(8, 9, 10);
        HomeworkLesson8.method2(5, 10);


    }
}