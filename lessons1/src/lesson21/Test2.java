package lesson21;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(1, "Ivanov");

        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println(list);
    }
}
