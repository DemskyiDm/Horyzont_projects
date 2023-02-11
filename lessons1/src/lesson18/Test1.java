package lesson18;

public class Test1 {
    public static void main(String[] args) {
        int[] array1;

        String[] array2 = new String[10];
        double[][] array3;
        array1 = new int[8];
        array3 = new double[3][3];
        int[][] array10 = new int[3][4];
        System.out.println(array2.length);
        array2[0] = "privet";
        array2[1] = "poka";

        array3[0][0]=3.14;

        double array5[] = new double[2];
        array5[0]=2.5;
        array5[1]=3.5;

        array3[1]=array5;



    }
}
