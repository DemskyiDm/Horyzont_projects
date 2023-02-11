package Lesson6;

public class Employee {

   public Employee(int id2, String surname2, int age2) {
        id = id2;
        surname = surname2;
        age = age2;
    }

    Employee(int id2, String surname2, int age2, double salary2, String department2) {
        id=id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;

}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivanov", 25);
      //  Lesson6.Employee emp2 = new Lesson6.Employee("Petrov", 30);
      //  Lesson6.Employee emp3 = new Lesson6.Employee(3, "petrov", 30, 30,"finance");
    }
}