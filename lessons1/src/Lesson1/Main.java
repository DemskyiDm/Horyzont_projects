package Lesson1;

public class Main {
    public static void main(String[] args) {

        byte b = 12;
        byte b1 =0b1100;
        byte b2 = 014;
        byte b3 = 0XC;

        short a = 1300;
        short a1 = 0b0101_0001_0100;
        short a2 = 02424;
        short a3 = 0x514;

        int c = 0;
        int c1 = 0b0;
        int c2 = 00;
        int c3 = 0x0;

        long d = 123456789L;
        long d1 = 0b111_0101_1011_1100_1101_0001_0101L;
        long d2 = 0726_746_425L;
        long d3 = 0x75BCD15L;

        System.out.println(b+b1+b2+b3);
        System.out.println(a+a1+a2+a3);
        System.out.println(c+c1+c2+c3);
        System.out.println(d+d1+d2+d3);


        float g = 3.45F;
        float g1 = 2.78F;

        double p = 2.33;
        double p1 = 9.22;

        boolean t = true;
        boolean t1 = false;

        System.out.println(p+" "+p1);
        System.out.println(g+" "+g1);
        System.out.println(t+" "+t1);

        char c11 = 'a';
        char c12 = '\u0234';
        char c13 = 600;

        System.out.println(c11 +"  " + c12+ "   "+c13);


        //System.out.println("Hello world!");
    }
}