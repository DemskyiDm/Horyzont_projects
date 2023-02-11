package Lesson12;

class Test10 {

    void maximum(int i1, int i2, int i3) { //metod
        if (i1 > i2 && i2 > i3) {
            System.out.println("masimum - " + i1);
        } else if (i2 > i1 && i2 > i3) {
            System.out.println("masimum - " + i2);
        } else {
            System.out.println("masimum - " + i3);
        }
    }

    void abc () {
        String str;
        int a = 10;
        if (a>=10) {
            str = "privet";
        }
        if (a<10) {
            str = "poka";
        }
        else {
            str = null;
        }
        System.out.println(str);

    }

    public static void main(String[] args) {
Test10 t = new Test10();
t.maximum(4,7,0);
int a = 9;
        int b = 7;
        int c = (a<10)?a:b;
        System.out.println(c);
    }
}



