package Lesson8;

public class Student {
    String name;
    int course;
    static int count;
    int a;

    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student " + count + " sozdan");
    }

    public static void ShowCount() {
        System.out.println("Vsego sodano " + count);
    }

    public void ShowInfo() {
        System.out.println("Welcome to the student class");
    }

    void abc() {
        a++;
        count++;
    }



    static void  abcd() {
        count++;
        Student St2 = new Student("Petr", 1);
        St2.a++;
    }

    public static void main(String[] args) {

        abcd();
        Student st3 = new Student("petr", 1);
st3.abc();

    }

}

//class StudentTest {
//    public static void main(String[] args) {
//        Student st1 = new Student("Ivan", 1);
//        System.out.println(Student.count);
//        Student st2 = new Student("Piotr", 4);
//        System.out.println(st2.count);
//        Student st3 = new Student("Masha", 2);
//        System.out.println(st3.count);
//        Student.ShowCount();
//    }
//}
//
//
//
//
