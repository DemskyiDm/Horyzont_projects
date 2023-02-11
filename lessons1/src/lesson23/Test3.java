package lesson23;

public class Test3 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.eat();

    }
}


class Employee {
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("employee eats");
    }

    void sleep() {
        System.out.println("sleeping");
    }
}

class Teacher extends Employee implements Help_able {
    int kol_voUch;

    void eat() {
        System.out.println("kushaiet uchitel");
    }

    void uchit() {
        System.out.println("uchit");
    }

    public void help() {
        System.out.println("pomosh");
    }

    public void tushyt_pozar() {
        System.out.println("tusyt pozar");
    }
}

class Driver extends Employee implements Help_able, swim_able{
    String nameOfCar;

    void vodit() {
        System.out.println("void");
    }
    public void help() {
        System.out.println("pomosh");
    }

    public void tushyt_pozar() {
        System.out.println("tusyt pozar");
    }
    public void swim() {
        System.out.println("plawaet");
        
    }
}

interface Help_able {
    void help();

    void tushyt_pozar();
}

interface swim_able {
    void swim();
}