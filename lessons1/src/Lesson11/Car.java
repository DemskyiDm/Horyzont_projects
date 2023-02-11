package Lesson11;

public class Car {
    String color;
    String engine;
    int doors;

    Car(String color_new, String engine_new, int doors_new) {
        this.color = color_new;
        this.engine = engine_new;
        this.doors = doors_new;
    }

}


class CarTest {
    void changeDoors(Car c, int doors) {
        c.doors = doors;
//        return newDoors;
    }

    void changeColor(Car c1, Car c2) {
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car1 = new Car("red", "v8", 5);
        Car car2 = new Car("black", "v6", 3);
        ct.changeDoors(car1, 12);
        System.out.println(car1.doors);
        ct.changeColor(car1, car2);
        System.out.println(car1.color + "  " + car2.color);

    }


}

