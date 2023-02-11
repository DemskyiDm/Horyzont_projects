package lesson17;

public class HMWL17 {


    static boolean ravenstwo(StringBuilder sb1, StringBuilder sb2) {
        boolean f;
        f = sb1.equals(sb2);
        return f;
    }


    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = new StringBuilder();
        sb2=sb1;
        System.out.println(ravenstwo(sb1, sb2));


    }


}

