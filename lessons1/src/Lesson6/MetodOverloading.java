package Lesson6;

public class MetodOverloading {


        void show (int i1) {
            System.out.println(i1);
         }

         void show (boolean b1) {
            System.out.println(b1);
         }

         void show (String s1) {
            System.out.println(s1);
         }

         void show (String s, int a) {
            System.out.println(s+ "  "+a);
         }

        void show (int a,String s) {
            System.out.println("dsadad");
        }

}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MetodOverloading mo = new MetodOverloading();
        int a = 500;
        mo.show(a);
        boolean b=true;
        mo.show(b);
        String s = "Privet";
        mo.show(s);
        mo.show("privet", 10);


    }
}