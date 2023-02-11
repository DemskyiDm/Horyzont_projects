package podstawy.zadanie4;

public class Zad4 {

    private static int[] setTable(String[] args) {
        int[] table = new int[args.length];
        int lengthOfTable = 0;
        for (String s : args) {
            try {
                int elementOfTable = Integer.parseInt(s);
                table[lengthOfTable] = elementOfTable;
                lengthOfTable++;
            } catch (NumberFormatException ex) {
                System.err.println("napis " + s + " nie jest liczba");
            }
        }
        return table;
    }

    private static void checkNumbersOfTable(int[] table) {
        for (int k : table) {
            if (k == 0 || k == 1 || k == -1) {
                System.out.println("dla liczby " + k + " dzielnik tylko jeden 1");
                continue;
            } else {
                System.out.print("dla liczby " + k + " dzielniki: ");
            }
            for (int j = 1; j <= Math.abs(k); j++) {
                if (k % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        checkNumbersOfTable(setTable(args));
    }
}
