package Lesson6;

public class HomeWorkLesson6 {

    int HomeWorkLesson6 (int a0, int b0, int c0, int d0) { //метод
        int output=a0+b0+c0+d0;
        System.out.println(output);
        return output;

    }

    int HomeWorkLesson6 (int a1, int b1, int c1) {
        int output1=a1+b1+c1;
        System.out.println(output1);
        return output1;

    }

   int HomeWorkLesson6 (int a2, int b2) {

        int output2=a2+b2;
        System.out.println(output2);
        return output2;

    }

   int HomeWorkLesson6 (int a3) {
        int output3=a3;
        System.out.println(output3);
        return output3;

    }

   int HomeWorkLesson6 () {
       int output4 = 0;
       System.out.println(output4);
       return output4;
    }



}

class HomeWorkLesson6Test {
    public static void main(String[] args) {
// визов метода
        HomeWorkLesson6 sum = new HomeWorkLesson6();
        sum.HomeWorkLesson6(1);
        sum.HomeWorkLesson6(1,2);
        sum.HomeWorkLesson6(1,3,4);
        sum.HomeWorkLesson6(1,5,4,3);
        sum.HomeWorkLesson6();

    }
}
