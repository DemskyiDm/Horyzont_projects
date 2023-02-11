package Lesson12;

import Lesson11.Student;

public class StudentTest {

    public static void firstMethod(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Students equals");
        } else {
            System.out.println("Students not equals");
        }
    }

    void secondMethod(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Student are equals");
                } else {
                    System.out.println("Grades are not equals");
                }
            } else {
                System.out.println("Courses and Grades are not equals");
            }
        } else {
            System.out.println("Names are not equals");
        }
    }

    public static void main(String[] args) {
        StudentTest Stest1 = new StudentTest();
        Student st1 = new Student("Ivan", 4, 3);
        Student st2 = new Student("Ivanov", 4, 2);
        Stest1.firstMethod(st1, st2);
        Stest1.secondMethod(st1, st2);
    }


}
