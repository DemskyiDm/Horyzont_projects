package Lesson8;

public class hml8zad2 {
    public static final double pi = 3.14;


    public double ploshadCircle(double R) {
        double ploshadCircle1 = pi * R * R;
        return ploshadCircle1;
    }

    public static double dlinaCircle(double R) {
        double dlinaCircle1 = 2 * pi * R;
        return dlinaCircle1;
    }

    public void infoCircle(double R) {
        System.out.println("radius " + R + " plosad kruga " + ploshadCircle(R) + " dlina kruga " + dlinaCircle(R));
    }


}

class hml8zad2Test {
    public static void main(String[] args) {
        hml8zad2 zad2 = new hml8zad2();
        System.out.println(zad2.ploshadCircle(4.5));
        System.out.println(hml8zad2.dlinaCircle(4.5));
        zad2.infoCircle(4.5);

    }
}
