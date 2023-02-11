package lesson21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HmW {

    public ArrayList<String>  abc(String... s) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        for (String value : s) {
            if (arrayList1.contains(value)) {
            } else {
                arrayList1.add(value);
            }
        }
        Collections.sort(arrayList1);
        System.out.println(arrayList1);
        return arrayList1;
        
    }


    public static void main(String[] args) {
HmW hmw = new HmW();
        hmw.abc("b", "c", "d", "e", "c", "a", "b", "a", "b");

    }
}
