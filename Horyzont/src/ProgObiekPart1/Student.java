package ProgObiekPart1;

public class Student {
    private String name;
    private String surname;
    private int age;
    private int course;
    private double averageScore;
    private boolean groupLeader;

    Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    Student(String name, String surname, int age) {
        this(name, surname);
        this.age = age;
    }

    Student(String name, String surname, int age, int course) {
        this(name, surname, age);
        this.course = course;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    String getSurname() {
        return surname;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    void setCourse(int course) {
        this.course = course;
    }

    int getCourse() {
        return course;
    }

    void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    double getAverageScore() {
        return averageScore;
    }

    void setGroupLeader(boolean groupLeader) {
        this.groupLeader = groupLeader;
    }

    boolean getGroupLeader() {
        return groupLeader;
    }

}

class Univercity {


    public static void main(String[] args) {
        Student st1 = new Student("Piotr", "Laszczyk");
        Student st2 = new Student("Tomasz", "Janczyk");
        Student st3 = new Student("Mateusz", "Kowalski", 22);
        Student st4 = new Student("Marcin", "Tomaszewicz", 18);
        Student st5 = new Student("Pawel", "Blaszczyk", 21, 1);
        Student st6 = new Student("Piotr", "Kubiak", 19, 1);
        st1.setCourse(2);
        st1.setAverageScore(3.5);
        st1.setGroupLeader(false);
        st2.setCourse(1);
        st2.setAverageScore(4.5);
        st2.setGroupLeader(false);
        st3.setCourse(1);
        st3.setAverageScore(5.0);
        st3.setGroupLeader(true);
        st4.setCourse(3);
        st4.setAverageScore(3.5);
        st4.setGroupLeader(false);
        st5.setGroupLeader(false);
        st6.setGroupLeader(true);
        String nameOfStudent;
        String surnameOfStudent;
        int ageOfStudent;
        int courseOfStudent;
        nameOfStudent=st1.getName();
        surnameOfStudent=st2.getSurname();
        ageOfStudent= st3.getAge();;
        courseOfStudent= st4.getCourse();
        System.out.println(nameOfStudent);
        System.out.println(surnameOfStudent);
        System.out.println(ageOfStudent);
        System.out.println(courseOfStudent);
    }
}

