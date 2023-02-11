package Lesson5;

public class Car {
    Car (String color, String engine) {
        color1=color;
        eng1=engine;
    }
    String color1;
    String eng1;
    /*
    String color;
    String engine;

    int speed;

    int gaz (int skorost) {
        speed += skorost;
        return speed;
    }

    int tormoz (int skorost) {
        speed -= skorost;
        return speed;
    }

    void showInfo() {
        System.out.println(color+"motor" + engine + "skorost " + speed);
    }
*/
}

class Car2Test {
    public static void main (String[] args) {
        Car c1 = new Car("red", "v5");
        System.out.println(c1.color1);
        /*
        c1.color = "white";
        c1.engine = "v8";
        c1.speed = 60;
        c1.gaz(30);
        c1.showInfo();
        c1.tormoz(40);
        c1.showInfo();
*/
    }
}




