package Lesson9;

public class Student {
    int a = 1;
    public static int b = 2;

    void abc(int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Student.b);

    }

    public static void main(String[] args) {
        Student t = new Student();
        t.abc(4);

    }//2 4 1 2
}
