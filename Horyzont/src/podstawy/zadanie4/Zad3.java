package podstawy.zadanie4;

public class Zad3 {
    private static void checkNumbersNKM(int n, double k, double m) {
        if (n <= 1) {
            throw new IllegalArgumentException("Wprowadz dane wieksze od 1");
        }
        if (k <= 10 || k >= 100) {
            throw new IllegalArgumentException("Wprowadz dane od 10 do 100");
        }
        if (m <= -k || m >= k) {
            throw new IllegalArgumentException("Wprowadz dane od -k " + k + " do k " + k);
        }
    }

    private static double getRandom(double k) {
        return Math.floor(Math.random() * (Math.floor(k) - Math.ceil(-k) + 1)) + Math.ceil(-k);
    }

    private static double[] getTable(int n, double k) {
        double[] table = new double[n];
        for (int i = 0; i < n; i++) {
            table[i] = getRandom(k);
        }
        return table;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double k = Double.parseDouble((args[1]));
        double m = Double.parseDouble(args[2]);
        int numberOfRepetitions = 0;

        checkNumbersNKM(n, k, m);

        for (double p : getTable(n, k)) {
            if (m == p) {
                numberOfRepetitions++;
            }
        }

        System.out.println(numberOfRepetitions);
    }
}
