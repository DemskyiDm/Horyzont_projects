package Lesson4;

public class Student {

    Student(int num1, String name1, String nazwisko1, double AverageMat1, double AverageEkon1, double AverageAngl1) {
        // конструктор создаем
        num = num1;
        name = name1;
        nazwisko = nazwisko1;
        AverageMat = AverageMat1;
        AverageEkon = AverageEkon1;
        AverageAngl = AverageAngl1;
    }

    Student(int num2, String name2, String nazwisko2) { // конструктор создаем

        this(num2, name2, nazwisko2, 0.0, 0.0, 0.0);

    }

    Student() {
    }


    int num;
    String name;
    String nazwisko;
    double AverageMat;
    double AverageEkon;
    double AverageAngl;

}


class StudentTest {

    double SredneeArif(Student st) {
        double SredneeArif = ((st.AverageEkon + st.AverageMat + st.AverageAngl) / 3);
        System.out.println(st.name + " srednee " + SredneeArif);
        return SredneeArif;
    }

    public static void main(String[] arg) {
        Student st1 = new Student(1, "Piotr", "Petrov", 4.5, 3.2, 4.7);
        Student st2 = new Student(2, "ivan", "Ivanov");
        Student st3 = new Student();

        StudentTest stt = new StudentTest();
        stt.SredneeArif(st1);


        System.out.println(st1.name + " Average " + ((st1.AverageMat + st1.AverageEkon + st1.AverageAngl) / 3));


    }
}


