package lesson18;

public class Test6 {
    public static void maxmin(double[] array) {
        double max = array[0];
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }

    public static void main(String[] args) {
int m = 2;
int l = 3;
int n = 4;
m *=l*n;
        System.out.println(m);
    }
}
