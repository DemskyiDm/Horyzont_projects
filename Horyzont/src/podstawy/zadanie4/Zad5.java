package podstawy.zadanie4;

public class Zad5 {
    private static double getAverage(double... restVariable) {
        double summ = 0;
        for (double variable : restVariable) {
            summ += variable;
        }
        return summ / restVariable.length;
    }

    private static void getDeviation(double... restVariable) {
        double deviation = 0;
        for (double variableDeviation : restVariable) {
            deviation += Math.pow((variableDeviation - getAverage(restVariable)), 2);
        }
        double standardDeviation = Math.sqrt((deviation / restVariable.length));

        System.out.printf("Odchylenie standardowe dla zadanych liczb wynosi %.4f%n", standardDeviation);
    }


    public static void main(String[] args) {
        getDeviation(10, 15, 20);
        getDeviation(10, 15, 20, 7, 4, 2, 6, 7, 99);
        getDeviation(10, 15, 200, 234, 333, 123, 3432, 12);
        getDeviation(10, 15, 20, 23, 34, 45, 56, 67, 78, 89);
    }
}
