package lesson21;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("privet");
        list.add(5);
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        list.add(new StringBuilder("ok"));
        ArrayList <String> list1 = new ArrayList<>(20);
        list1.add("poka");
ArrayList <String> list2 = new ArrayList<>(list1);
        System.out.println(list);


    }

}

class Car {

}

class Student {
}
