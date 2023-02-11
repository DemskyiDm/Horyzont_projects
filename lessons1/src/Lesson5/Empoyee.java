package Lesson5;

class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee (int id1, String surname1, int age1, double salary1, String department1) {
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        department = department1;
    }
    double RostZp () {
        salary = salary*2;
                return salary;
    }
}

class EmployeeTest {

    public static void main (String[] arg) {
       Employee Emp1 = new Employee(33, "ivanov", 33, 500, "finance");
       Employee Emp2 = new Employee(34, "petrov", 45,900, "finance");

        Emp1.RostZp();
        System.out.println("name " + Emp1.surname + " salary " + Emp1.salary);
        Emp2.RostZp();
        System.out.println("name " + Emp2.surname + " salary " + Emp2.salary);
   }
}
