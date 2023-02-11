package Lesson8;

public class Test1 {
    public  int a;

    Test1() {
        final int a = 10;
    }

    Test1(boolean b) {
        a = 15;
    }

    public void abc(short s) {
        byte b = 10;
        System.out.println(s+b);
    }

    public static void main(String [] args) {
        Test1 t = new Test1();
        //t.a = t.a * 2;
        System.out.println(t.a);
    }
}
